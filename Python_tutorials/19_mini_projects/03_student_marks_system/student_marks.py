def grade(marks):
    if marks >= 80: return "A"
    if marks >= 60: return "B"
    if marks >= 40: return "C"
    return "F"

students = []
count = int(input("How many students? "))
for _ in range(count):
    name = input("Name: ")
    marks = float(input("Marks: "))
    students.append({"name": name, "marks": marks, "grade": grade(marks)})

print("\nResults")
for student in students:
    print(student)
