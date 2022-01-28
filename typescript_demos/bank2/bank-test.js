"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var b = require("./bank-module");
var a = new b.Account(200);
var c = new b.Customer(1, "Rohit");
console.log({ a: a, c: c });
// let obj = new Bank("hdfc","hyderabad" )
// let a = new Account(101)
// let b = new Bank("Icici" , "Mumbai")
// let c = new Customer(1,"Sachin")
// console.log(a,b,c)
// console.log({a,b,c})
