const express= require('express');
const app=express();

const members=[
    {
        id:1,
        name:'Shashank',
        email:'shashankmv78@gmail.com',
        status:'active'
    },
    {
        id:1,
        name:'Shashank',
        email:'shashankmv78@gmail.com',
        status:'active'
    },
    {
        id:1,
        name:'Shashank',
        email:'shashankmv78@gmail.com',
        status:'active'
    },
];

app.get('/api/members',(req,res)=>{
    res.json(members);
});

const PORT=process.env.PORT||5000;
app.listen(PORT,()=>console.log('server started...'));