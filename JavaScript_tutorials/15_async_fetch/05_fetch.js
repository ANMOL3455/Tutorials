async function getData(){ const response=await fetch('https://jsonplaceholder.typicode.com/todos/1'); if(!response.ok) throw new Error(`HTTP ${response.status}`); const data=await response.json(); console.log(data); }
getData().catch(console.error);
