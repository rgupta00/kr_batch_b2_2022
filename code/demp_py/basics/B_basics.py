#if else
age=int(input('enter ur age'))
message=''
if age >= 1900:
    message='kid of 90'
elif age >=2000:
    message='bachpan nahi rahi'
else:
    message = 'God knows'
print(message)