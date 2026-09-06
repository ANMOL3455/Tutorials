class Person { constructor(name){this._name=name;} get name(){return this._name;} set name(value){if(!value) throw new Error('Name required'); this._name=value;} }
const p=new Person('Anmol'); console.log(p.name);
