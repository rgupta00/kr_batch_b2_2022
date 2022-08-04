# tuple in js immutable ()
        #0 1  2  3  4
tuple4=(4,6,7,8,10,11,45)
tuple5=tuple4[2:5];
print(tuple5)
print('-------------')

(name, marks)=('raj',66)
print(name, ' ', marks)

tuple1=(10,15,'apple',6.8,'a')
status= 'apple' in tuple1
print(status)
# tuple1[3]='a' error
# print(tuple1)
tuple2=(6,);
tuple3= tuple1+ tuple2
print(tuple3*3)
print(type(tuple2))