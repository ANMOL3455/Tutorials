class Person:
    def __init__(self, name):
        self.name = name

class Student(Person):
    def __init__(self, name, level):
        super().__init__(name)
        self.level = level

student = Student("Anmol", "Bachelor")
print(student.name, student.level)
