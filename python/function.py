#function.py
'''
def 함수명(매개변수)
    처리문
    ...
'''
def add(a,b):
    return a+b
a=b=3
c=add(a,b)
print(c)

def sum_many(*args):
    res=0
    for i in args:
        res += i
    return res

print(sum_many(1,2,5,7,89,3,3))

def cal_temp(method,*args):
    if method=='add':
        res=0
        for i in args:
            res+=i
    elif method=='mul':
        res=1
        for i in args:
            res*=i
    return res
print(cal_temp('add',3,5,12,5,3,6))
print(cal_temp('mul',3,4,6,2,3))

def add_mul(a,b):
    return a+b,a*b
res=add_mul(2,3)
print(res)
res1,res2=add_mul(3,4)
print(res1)
print(res2)

def say(message='hello'):
    return message
print(say('hi'))
print(say())
def say(message2,message='hello'):
    return message+message2
print(say('world'))

var=1
def vararea(var1):
    var1+=1
    global var
    var+=1
    print(var1)
    print(var)
vararea(10)
print(var)

#lambda
add = lambda a,b:a+b
print(add(3,10))

