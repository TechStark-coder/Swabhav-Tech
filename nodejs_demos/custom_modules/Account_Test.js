const Account = require("./Account");
const acc1 = new Account(100,"rahul",1000);
const acc2 = new Account(101,"sohail",5000);
const acc3 = new Account(102,"raj",6000);


acc1.deposit(1000);

getDetails = function(){
    console.log("Id is"  +acc1.getId());
    console.log("Name is"  +acc1.getName());
    console.log("Balance is"  + " "+ acc1.getBalance());
}
getDetails();
