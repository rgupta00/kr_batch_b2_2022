const mysql = require('mysql')

let conn=mysql.createConnection({
    user:"root",password:"root", database:"ymsdemo3", host:"localhost"
})
conn.connect(function(err){
    if(err)
        throw err;
    console.log('conn is done')
})


console.log('listing on port 8090')
