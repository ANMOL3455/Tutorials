class Animal { constructor(name){this.name=name;} }
class Dog extends Animal { constructor(name,breed){super(name);this.breed=breed;} }
console.log(new Dog('Max','Lab'));
