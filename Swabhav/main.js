const {Worker} = require("worker_threads");

let num = 20;

const worker = new Worker("./worker.js", {workerData: {num: num}});


worker.once("message", result => {
  console.log(`${num}th Fibonacci Number: ${result}`);
});

worker.on("error", error => {
  console.log(error);
});

worker.on("exit", exitCode => {
  console.log(exitCode);
})

console.log("End of the program");