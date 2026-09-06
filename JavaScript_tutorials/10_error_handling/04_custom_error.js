class ValidationError extends Error { constructor(message){ super(message); this.name='ValidationError'; } }
try { throw new ValidationError('Invalid input'); } catch(e){ console.log(e.name,e.message); }
