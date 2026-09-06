const n=29; let prime=n>=2; for(let i=2;i*i<=n&&prime;i++) if(n%i===0) prime=false; console.log(prime?'Prime':'Not prime');
