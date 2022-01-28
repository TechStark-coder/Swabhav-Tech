function adminOnly(req,resp,next){
    if(!req.user.isAdmin)
    return resp.status(403).send("Acess denied")
    next();
}
module.exports = adminOnly