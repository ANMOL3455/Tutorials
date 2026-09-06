try { JSON.parse('{bad json}'); } catch(error) { console.log('Caught:', error.message); }
