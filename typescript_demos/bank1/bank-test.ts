import{Account,Bank,Customer} from './bank-module'

let a = new Account(101)
let b = new Bank("Icici" , "Mumbai")
let c = new Customer(1,"Sachin")
console.log(a,b,c)
console.log({a,b,c})