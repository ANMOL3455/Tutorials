try:
    value = int(input("Enter an integer: "))
except ValueError:
    print("Invalid input")
else:
    print("You entered", value)
finally:
    print("This always runs.")
