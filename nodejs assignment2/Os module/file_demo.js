const fs=require('fs');
const path= require('path');

/*fs.mkdir(path.join(__dirname,'/test'),{},function(err){
    if(err)throw err;
    console.log('')
})*/

/*fs.writeFile(path.join(__dirname,'/test','/hello.txt')
,'My text file contains'
,(err)=>{
    if(err) throw err,
    console.log('File written to...');
})*/

fs.readFile(path.join(__dirname,'/test','hello.txt'),'utf8',(err,data)=>{
    if(err)throw err;
    console.log(data);
})

