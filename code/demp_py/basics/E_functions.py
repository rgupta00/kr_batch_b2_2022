# functions in js
# def addNumers(n1):
#     print('method 2')
#     return (n1)

def addNumers(n1=0, n2=0):
    if type(n1)!=type(n2):
        print('are not same type')
        raise Exception("diff type of data")
    else:
        return (n1+n2)

try:
    print(addNumers(5, "foo"))
except Exception:
    print('dont do that')
# https://w3.cs.jmu.edu/lam2mo/cs240_2014_08/lab05-exceptions.html