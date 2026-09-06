function calculate(a,op,b){ if(op==='+')return a+b; if(op==='-')return a-b; if(op==='*')return a*b; if(op==='/'){if(b===0)throw new Error('Division by zero');return a/b;} throw new Error('Unknown operator'); }
console.log(calculate(10,'*',5));
