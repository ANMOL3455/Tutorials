class Student:
    school = "ABC College"

    def __init__(self, name):
        self.name = name

one = Student("A")
two = Student("B")
print(one.school)
print(two.school)
