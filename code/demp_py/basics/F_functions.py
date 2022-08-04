# functions in js
# def addNumers(n1):
#     print('method 2')
#     return (n1)
#
# def addNumers(n1=0, n2=0):
#     if type(n1)!=type(n2):
#         print('are not same type')
#         raise Exception("diff type of data")
#     else:
#         return (n1+n2)
#
# try:
#     print(addNumers(5, "foo"))
# except Exception:
#     print('dont do that')

# * and ** *args and **kwargs in Python
def studentDetails(name, age, **marks):
    print('name' ,name)
    print('age',age)
    print('marks:')
    print(type(marks))
   # marks[1]=33
    for k, v in marks.items():
        print(k, ' ', v)

studentDetails('raj',42,maths=89,phy=90,eng=56,md=89)

# https://w3.cs.jmu.edu/lam2mo/cs240_2014_08/lab05-exceptions.html