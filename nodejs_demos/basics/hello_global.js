console.log(global.process == process)
console.log(global.setTimeout == setTimeout)
// console.log(global)
setTimeout(()=> function(){
console.log("after 3 seconds")
},3000);
console.log("end")
console.log(global)