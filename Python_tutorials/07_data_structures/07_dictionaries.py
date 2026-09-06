student = {"name": "Anmol", "age": 19, "marks": 85}
print(student["name"])
student["marks"] = 90
student["city"] = "Kathmandu"
for key, value in student.items():
    print(key, "=", value)
