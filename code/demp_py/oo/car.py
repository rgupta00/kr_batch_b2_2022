
class Car:
    def __init__(self, speed, color):
        self.__speed= speed
        self.__color= color

    def set_speed(self, speed):
         self.__speed=speed;

    def set_color(self, color):
        self.__color = color;

    def get_speed(self):
        return f"the speed is {self.__speed}"

    def get_color(self):
        return self.__color;

    def printMe(self):
        print('the spped is :', self.__speed)
        print('the color is :', self.__color)

c=Car(55,'blue');

#print(c.__speed)
print(c.get_speed())
print(c.get_color())
c.set_speed(78)
c.printMe()



# class Car:
#     def __init__(self, speed, color):
#         self.speed= speed
#         self.color= color
#     def printMe(self):
#         print('the spped is :', self.speed)
#         print('the color is :', self.color)
#
# c=Car(55,'blue');
# print(c.color)
# c.printMe()