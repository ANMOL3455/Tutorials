const students=[{name:'Anmol',marks:[80,90,75]},{name:'Sita',marks:[70,65,85]}];
for(const s of students){const avg=s.marks.reduce((a,b)=>a+b,0)/s.marks.length; console.log(s.name,avg.toFixed(2));}
