def calculate(a, operator, b):
    if operator == "+": return a + b
    if operator == "-": return a - b
    if operator == "*": return a * b
    if operator == "/":
        if b == 0: raise ZeroDivisionError("Cannot divide by zero")
        return a / b
    raise ValueError("Unknown operator")

print("Simple Calculator")
try:
    a = float(input("First number: "))
    operator = input("Operator (+ - * /): ").strip()
    b = float(input("Second number: "))
    print("Result:", calculate(a, operator, b))
except (ValueError, ZeroDivisionError) as error:
    print("Error:", error)
