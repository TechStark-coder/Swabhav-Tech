module.exports = function(req,res,next){
    console.info("fetching cooking info from request : " + new Date());
    next();
}