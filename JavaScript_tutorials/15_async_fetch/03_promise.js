const promise=new Promise((resolve,reject)=>setTimeout(()=>resolve('Success'),300)); promise.then(console.log).catch(console.error);
