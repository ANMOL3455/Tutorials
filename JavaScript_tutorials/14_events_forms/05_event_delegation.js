document.querySelector('#list')?.addEventListener('click',e=>{ if(e.target.matches('li')) console.log('Clicked:',e.target.textContent); });
