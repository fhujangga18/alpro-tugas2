class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def display_info(self):
        print(f"Nama: {self.name}, Umur: {self.age}")


person1 = Person("Basrul", 25)
person2 = Person("Gaga", 30)


print(person1.name) 
print(person2.age)   


person1.display_info()  
person2.display_info()  