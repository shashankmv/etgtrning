const fs=require('fs');
const path= require('path');

fs.mkdir(path.join(__dirname,'/Training'),{},function(err){
    if(err)throw err;
    console.log('')
})

fs.writeFile(path.join(__dirname,'/Training','/student.java')
,'My name is Shashank'
,(err)=>{
    if(err) throw err,
    console.log('File written to...');
})

fs.readFile(path.join(__dirname,'/Training','student.java'),'utf8',(err,data)=>{
    if(err)throw err;
    console.log(data);
})
