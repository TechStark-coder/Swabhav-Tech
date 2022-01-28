if(process.argv.length > 2){
for(let index = 2; index<process.argv.length;index++){
console.log("Hello" + process.argv[index]);
}
return;
}
console.log("Hello Monocept!!");