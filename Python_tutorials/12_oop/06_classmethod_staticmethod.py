class Student:
    school = "ABC College"

    def __init__(self, name):
        self.name = name

    @classmethod
    def change_school(cls, name):
        cls.school = name

    @staticmethod
    def is_adult(age):
        return age >= 18

Student.change_school("XYZ College")
print(Student.school)
print(Student.is_adult(19))
