class Person:
    def __init__(self, name):
        self.__name= name
    def print_person_details(self):
       print('the name of person: ',self.__name )
       self.__logging_helper()

    def __logging_helper(self):
        print('some basic logging')
class Emp(Person):
    def __init__(self, name, salary):
        self.__salary= salary
        Person.__init__( self, name)

    def print_person_details(self):
        Person.print_person_details(self)
        print('the name of person: ', self.__salary)


e =Emp('raj',60)
e.print_person_details()