const {parentPort , numData}= require("nums")
parentPort.postMessage(getFib(numData.num));

function getFib(num){
    if(num <=1){
        return num;
    }
    let fNum = getFib (num - 1);
    let sNum = getFib (num - 2);

    return fNum + sNum;
    
}