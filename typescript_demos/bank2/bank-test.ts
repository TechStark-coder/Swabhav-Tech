// import Bank,{Account,Customer} from './bank-module'
import B from './bank-module'
import * as b from './bank-module'
let a  = new b.Account(200);
let c = new b.Customer(1, "Rohit")
console.log({a,c})

// let obj = new Bank("hdfc","hyderabad" )

// let a = new Account(101)
// let b = new Bank("Icici" , "Mumbai")
// let c = new Customer(1,"Sachin")
// console.log(a,b,c)
// console.log({a,b,c})