class Animal { speak(){return 'sound';} }
class Dog extends Animal { speak(){return 'woof';} }
console.log(new Dog().speak());
