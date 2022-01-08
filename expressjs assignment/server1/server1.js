const express=require('express');
const app=express();

app.use('/products',require('./router/index1'));

const PORT=process.env.PORT||4340;

app.listen(PORT,()=>console.log('server started...'));