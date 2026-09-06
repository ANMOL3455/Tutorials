async function run(){ try { throw new Error('Something failed'); } catch(e){ console.log(e.message); } }
run();
