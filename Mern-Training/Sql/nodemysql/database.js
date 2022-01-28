var dbconn = require('mysql')
const con = dbconn.createConnection({
    host: "localhost",
    user: "root",
    password: "asifmi785",
    database : "swabhav",
    connectionLimit: 10
});
// / pool.query(`select * from department` , (err, res) => {
    //     return console.log(res)
    // })

con.connect(function(err){
    if(err) throw err;
    console.log("db connected!");
    con.query(`SELECT * FROM department` , (err, res , fields) =>{
        if(err) throw err;
        console.log(res);
});})