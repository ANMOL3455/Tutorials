class Shape { area(){return 0;} } class Square extends Shape { constructor(s){super();this.s=s;} area(){return this.s*this.s;} } console.log(new Square(4).area());
