const Account = require('./account_event');
const acc1 = new Account(101,"Asif",5000);
acc1.on('balance_changed',sendSms);
acc1.on('balance_changed',sendEmail);
acc1.deposit(1000);
acc1.withdraw(200);

function sendSms(acc1) {
    console.log(`Sms : balance change for ${acc1.getName()} new balance : ${acc1.getBalance()}`);
}

function sendEmail(acc1) {
    console.log(`Email : balance change for ${acc1.getName()} new balance : ${acc1.getBalance()}`);
}