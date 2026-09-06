try:
    a = int(input("First number: "))
    b = int(input("Second number: "))
    print(a / b)
except ValueError:
    print("Enter numbers only.")
except ZeroDivisionError:
    print("Second number cannot be zero.")
