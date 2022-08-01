//how to create a hello world server

const http = require('http')
console.log('start')

let httpval=http.createServer(function(req, resp){
    resp.writeHead(200,{'content-type':'text/html'})
    resp.end('hello world!!!!!')
})

httpval.listen(8090)

console.log('listing on port 8090')

