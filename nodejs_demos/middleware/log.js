module.exports = function(req,resp,next){
    console.info("inside logging middleware : " + new Date());
    next();
}