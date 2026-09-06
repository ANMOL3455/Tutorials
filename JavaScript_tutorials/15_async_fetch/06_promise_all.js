const a=Promise.resolve(10), b=Promise.resolve(20); Promise.all([a,b]).then(values=>console.log(values));
