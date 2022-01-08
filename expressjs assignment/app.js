const express=require('express');
const app=express();
const path=require('path');

app.get('/',(req,res)=>{
    //res.send('<h1> Welcome to india</h1>')

    res.sendFile(path.join(__dirname,'public','dashboard.html'));
});

const port=process.env.port||5000;
app.listen(port,()=>console.log(`server started on port ${port}`));