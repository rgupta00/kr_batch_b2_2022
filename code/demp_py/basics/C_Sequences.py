#Sequences
# Strings   immutable    List        Tuples
str1='45a';
print(str1.isalnum())
print(str1.isdecimal())
print(str1.islower())
print(str1.capitalize())

# val= 'w' in str1;
# print(val)
#loop
# for ch in str1:
#     print(ch, end='\t')

#p=str1[1];
# p=3*str1;
# print(p)

# we have a list of some data i want to concat them
data=['foo','bar','jar','car'];
str3=' '.join(data);

str4= str3.split(' ')
print(type(str4));