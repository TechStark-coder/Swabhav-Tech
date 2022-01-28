"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var bank_module_1 = require("./bank-module");
var a = new bank_module_1.Account(101);
var b = new bank_module_1.Bank("Icici", "Mumbai");
var c = new bank_module_1.Customer(1, "Sachin");
console.log(a, b, c);
console.log({ a: a, b: b, c: c });
