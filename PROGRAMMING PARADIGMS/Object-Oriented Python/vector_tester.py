#Name: Roberto Reyes
#CIN:203807805
#COURSE: CS-3035-01
#Description: Tester class that test all methods in object class

from vector import Vector

obj = Vector(2,2,1)
obj1 = Vector(2,2,1)
num =5
print("str:" , obj.__str__())
print("repr:" ,obj.__repr__())
print("Magnitude:" , obj.magnitude())
print("== op:" , obj == obj1)

print("ADD:",obj + obj1)
iadd = obj
iadd+= obj1
print("IADD:" , iadd)
print("SUB:",obj - obj1)
isub = obj1
isub-= obj1
print("ISUB:", isub)
obj4 = obj* obj1
print("MUL:",obj4)
obj3= obj
obj3 *= num
print("IMUL:",obj3)

obj2 = obj % obj1
print("% opp:" ,obj2)
print("Getter:",obj[0])
obj[0] = 1
print("Setter:",obj[0])