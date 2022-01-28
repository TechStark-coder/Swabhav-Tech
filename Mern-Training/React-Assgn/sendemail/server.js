require('dotenv').config();
const nodemailer = require('nodemailer')


let transporter = nodemailer.createTransport({
    service: 'gmail',
    auth:{
        user: process.env.EMAIL,
        pass: process.env.PASSWORD
    }
});

let mailOptions ={
    from : 'marvelianasif@gmail.com',
    to: 'kannan@swabhavtechlabs.com',
    subject: 'Testing mail feature by asif',
    text : 'yes its working!!!'
};

transporter.sendMail(mailOptions, function(err , data) {
    if(err){
        console.log("error occurs", err) 
    }else{
        console.log('email sent successfully');
    }
});