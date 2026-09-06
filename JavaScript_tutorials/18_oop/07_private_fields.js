class BankAccount { #balance=0; deposit(amount){if(amount>0)this.#balance+=amount;} getBalance(){return this.#balance;} }
const a=new BankAccount(); a.deposit(100); console.log(a.getBalance());
