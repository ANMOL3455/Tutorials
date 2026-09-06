class BankAccount:
    def __init__(self, owner, balance=0.0):
        self.owner = owner
        self.balance = balance

    def deposit(self, amount):
        if amount <= 0: raise ValueError("Amount must be positive")
        self.balance += amount

    def withdraw(self, amount):
        if amount <= 0: raise ValueError("Amount must be positive")
        if amount > self.balance: raise ValueError("Insufficient balance")
        self.balance -= amount

account = BankAccount(input("Owner name: "), 0)
while True:
    print("\n1 Deposit  2 Withdraw  3 Balance  4 Exit")
    choice = input("Choice: ")
    try:
        if choice == "1": account.deposit(float(input("Amount: ")))
        elif choice == "2": account.withdraw(float(input("Amount: ")))
        elif choice == "3": print("Balance:", account.balance)
        elif choice == "4": break
        else: print("Invalid choice")
    except ValueError as error:
        print("Error:", error)
