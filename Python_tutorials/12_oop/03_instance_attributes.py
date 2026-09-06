class Car:
    def __init__(self, brand):
        self.brand = brand
        self.speed = 0

car = Car("Toyota")
car.speed = 60
print(car.brand, car.speed)
