class BankAccount:
    def __init__(self, owner, balance=0):
        self.owner = owner
        self.balance = balance

    def deposit(self, amount):
        self.balance += amount

    def show_balance(self):
        print(f"{self.owner}: {self.balance}")

account = BankAccount("Anmol", 1000)
account.deposit(500)
account.show_balance()
