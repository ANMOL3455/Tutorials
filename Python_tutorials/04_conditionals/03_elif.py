marks = float(input("Enter marks: "))
if marks >= 80:
    grade = "A"
elif marks >= 60:
    grade = "B"
elif marks >= 40:
    grade = "C"
else:
    grade = "F"
print("Grade:", grade)
