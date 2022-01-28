const JWT_SK = process.env.JWT_SECRET || 'mysecret'
const jwt = require('jsonwebtoken')
// import { verify } from 'jsonwebtoken'

function auth(req,resp,next){
    const bearer_token = req.header('Authorization')
    console.log(bearer_token)
    if(!bearer_token)
    return resp.status(401).send("Access denied,  no token")
    try{
        const token = bearer_token.split(' ')[1]
        const decodePayload = jwt.verify(token,JWT_SK)
        req.user = decodePayload
        next()
    }
    catch(ex){
        return resp.status(400).send("invalid token")
    }
}
    module.exports = auth