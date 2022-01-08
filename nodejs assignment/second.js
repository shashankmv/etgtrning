const http=require('http');

http.createServer((req,res)=>{
    res.writeHead(200,{'Content-Type':'text/html'})
    res.write("username:"+'<input type="text"><br><br>' )
    res.write("password:"+'<input type="text">' )
    res.end()
}).listen(5000,()=>console.log('server running......'));