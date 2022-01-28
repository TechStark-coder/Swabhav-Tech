const {createPool} = require ('mysql')
const pool = createPool({
    host : "localhost",
    user : "root",
    password : "asifmi785",
    database : "swabhav"
})
pool.query(`SELECT * FROM department`, (err , res) =>{
    return console.log(res)
})