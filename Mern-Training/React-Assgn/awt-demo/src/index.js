const express = require("express")
const bodyParser = require("body-parser")
const app = express();
const JWT_SK = process.env.JWT_SECRET || 'mysecret'
const jwt = require('jsonwebtoken')
const auth = require('./auth-middleware');
const adminOnly  =require("./admin-middleware");

app.use(bodyParser.json())
constusers ={
    1:{
    id:1,
    name:"sachin",
    pwd:"sachin",
    isAdmin:true
},
2:{
    id:2,
    name:"rahul",
    pwd:"rahul",
    isAdmin:false
}}
app.get('/',(req,resp)=>{
    return resp.send(users);
})
app.get('/private',auth,(req,resp)=>{
    return resp.send(req.user);
})
app.get('/veryPrivate',[auth, adminOnly],(req , resp)=>{
    return resp.send(req.user);
})
app.post('/login',(req,resp)=>{
    console.log(req.body)
    const{userId , password} = req.body
    const user = users[userId]
    console.log(user)
    if(!user){
        return resp.status(400).send("invalid user")
    }
    if(!password){
        return resp.status(400).send("invalid password")
    }
    const token = jwt.sign({...user},JWT_SK)
    return resp.send(token);
})