const url=require('url');
const myurl=new URL('http://localhost:8080/hello.html?id=100&status=active');
console.log(myurl.host);
console.log(myurl.hostname);
console.log(myurl.pathname);
console.log(myurl.search);
console.log(myurl.searchParams);

myurl.searchParams.append('abc','123');
console.log(myurl.serachParams);

myurl.searchParams.forEach((value,name)=>console.log(`${name}: ${value}`));