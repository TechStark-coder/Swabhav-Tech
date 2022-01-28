
const EventEmitter = require("events");
var btn = new EventEmitter();
btn.on("tap", godListener);
btn.on("tap", evilListener);
btn.emit("tap", { data: "test click data" });

function godListener(e) {
  console.log("God is listening");
  console.log(e);
}
function evilListener(e) {
  console.log("Evil is listening");
  console.log(e);
}

const account = new EventEmitter()
account.on('balance_changed',(newbalance) => console.log("sms: "+newbalance));
account.on('balance_changed',(newbalance) => console.log("email: "+newbalance));
account.emit("balance is changed", 1000);
console.log("end of program")
