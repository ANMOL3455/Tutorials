function wait(){ return new Promise(resolve=>setTimeout(()=>resolve('Done'),300)); }
async function main(){ const result=await wait(); console.log(result); }
main();
