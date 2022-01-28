const {Worker} = require ("nums")
let num = 55;
const worker = new Fnum("./myNum.js" , {numData : { num : num}});
worker.once("message" , result => {
    console.log(`$(num)th Fib No: ${result}`);
});

worker.on("error" , error => {
    console.log(error);
});

worker.on("exit" , exitCode => {
    console.log(exitCode);
});

console.log("program stuked!!")

