let express= require('express')
let app=express();

//Spring boot : Pathvariable /{} , RequestParam ?

//http://localhost:8090/customer2?eid=4&pid=5655
app.get("/customer2", function(req, res){
    // res.send(req.params.cid) 
    res.send(req.query) 
 })


//http://localhost:8090/customer/4/product/5655

app.get("/customer/:cid/product/:pid", function(req, res){
    // res.send(req.params.cid) 
    res.send(req.params) 
 })


let checkUrl=function(req, res, next){
    console.log('currunt url req was: '+req.originalUrl);
    next();
}

let checkUrl2=function(req, res, next){
    console.log('currunt url req was 2: '+req.originalUrl);
    next();
}


//app.use(checkUrl)

app.get("/", function(req, res){
   res.send('hello to all from express js') 
})

app.get("/home", function(req, res){
    res.send('home') 
 })

 app.get("/admin",[ checkUrl, checkUrl2], function(req, res){
    res.send('admin') 
 })

 app.get("/user", function(req, res){
    res.send('user') 
 })

 app.get("/user", function(req, res){
    res.send('user another route') 
 })

 app.get("/abc*pqr", function(req, res){
    res.send('abc*pqr') 
 })


app.listen(8090)
console.log('sever is listing')