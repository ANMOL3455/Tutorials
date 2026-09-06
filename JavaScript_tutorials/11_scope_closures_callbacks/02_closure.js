function counter(){ let count=0; return () => ++count; }
const next=counter(); console.log(next(),next(),next());
