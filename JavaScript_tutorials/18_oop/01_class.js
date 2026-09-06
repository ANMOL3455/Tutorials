class Student { constructor(name,marks){this.name=name;this.marks=marks;} greet(){return `Hello ${this.name}`;} }
const s=new Student('Anmol',85); console.log(s.greet());
