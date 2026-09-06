const expenses=[{title:'Food',amount:250},{title:'Bus',amount:40},{title:'Books',amount:500}];
const total=expenses.reduce((sum,e)=>sum+e.amount,0); console.log('Total expense:',total);
