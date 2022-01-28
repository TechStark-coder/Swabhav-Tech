const express = require("express");
const app = express ();
const auth = require("./auth")
const log = require("./log")
const cookie = require('./cookie.js') 
const res = require("express/lib/response");
// const req = require("express/lib/request");

app.use(log);
app.use(cookie);
app.use(auth);
app.get('/',(req,res)=>{
    res.end("inside express route /")
});
app.get('/data',(req,res)=>{
    res.end("inside express route/data")
});
app.listen(3000, (req,res)=>{
    console.log("port is listening")
});