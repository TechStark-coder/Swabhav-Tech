module.exports = function(req,res,next){
    console.info("inside auth middleware checking user authectication : " + new Date());
    next();
}