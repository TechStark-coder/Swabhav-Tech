const mysql = require("mysql")
const readLineSync = require('readline-sync');
const con = mysql.createConnection({
        host: "localhost",
        user: "root",
        password: "asifmi785",
        database : "swabhav"
    });
const connectionString="4040"
// sqlstmnt = createConnection(connectionString)
const empno = readLineSync.question('enter empno : ');
const sqlstmnt = `SELECT ENAME , EMPNO , SAL FROM EMP WHERE EMPNO=${empno}`;
// const sqlstmnt = `SELECT * FROM EMP WHERE EMPNO=${empno}`;

console.log(sqlstmnt);
con.query(sqlstmnt,(err,res)=>{
    if(err) throw err;
    console.log(res.length);
    console.log(res[0].EMPNO , res[0].ENAME , res[0].SAL);
    console.log(res);
});
con.end();