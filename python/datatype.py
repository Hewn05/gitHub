'''
data type
'''
#number
a = 123
b = -178
c = 0
print(a)
print(b)
print(c)
a = 1.2
b = -3.45
print(a)
print(b)
a = 4.24E10
b = 4.24e-10
print(a)
print(b)
a = 3
b = 4
print(a + b)
print(a * b)
print(a / b)
print(a ** b)
print(7 % 3)
print(7 / 4)
print(7 // 4)
#char
print("Hello World")
print('Python is fun')
print("""
Life is too short,
You need python
""")
print('''
Life is too short,
You need python
''')
say = "\"Python is very easy.\" he says."
print(say)
head = "Python"
tail = " is fun!"
print(head + tail)
print(head * 2)
print(len(say))
print(say[1]+say[8]+say[-7])
print(say[1:7])
print(say[10:])
print(say[10:-5])
data = "20010331Rainy"
year = data[:4]
day= data[4:8]
weather = data[8:]
print(year)
print(day)
print(weather)
'''
data[8]='s'
print(data)
'''
number = 10
day = "three"
res ="I ate %d apples. so I was sick for %s days." % (number, day)
print(res)
res= "I ate {0} apples. so I was sick for {1} days.".format(number, day)
print(res)
res="I ate {number} apples. so I was sick for {day} days.".format(number=10, day=3)
print(res)
print("{0:<10}".format("hi"))
print("{0:>10}".format("hi"))
print("{0:^10}".format("hi"))
name = '홍길동'
age = 30
print( f'나의 이름은 {name}입니다. 나이는 {age}입니다.')
print(f'나는 내년이면 {age+1}살이 된다.')
a = "Python is the best choice"
print(a.count('e'))
print(a.find('b'))
print(a.find('k'))
print(a.replace("Python","Java"))
a=" hi "
print(a.lstrip())
print(a.rstrip())
print(a.strip())
#upper lower
a = "Life is too short"
print(a.split())
b = "a:b:c:d"
print(b.split(':'))

#list
a = []
#a = list()
b = [1, 2, 3]
c = ['Life', 'is', 'too', 'short']
d = [1, 2, 'Life', 'is']
e = [1, 2, ['Life', 'is']]
print(e[-1][1])
a = [1, 2, 3, 4, 5, 6]
print(str(a[2]) + "hi")
a[2]=4
print(a)
del a[4:]
print(a)
#append sort reverse index insert remove count extend pop
#tuple
t1 = ()
t2 = (1,)
t3 = (1, 2, 3)
t4 = 1, 2, 3
t5 = ('a', 'b', ('ab', 'cd'))
#change delete X
#dictionary
dic = {'name':'pey', 'phone':'0119993323', 'birth': '1118'}
dic[4]='four'
print(dic[4])
print(dic)
del dic['phone']
print(dic)
print(dic.keys())
print(list(dic.keys()))
#set
s1=set([1,2,3])
print(s1)
s2=set([3,4,3,4,3,4,3,4])
print(s2)
s3=set("happy")
print(s3)
print(list(s3))
s1=set([1,2,3,4,5,6])
s2=set([4,5,6,7,8,9])
print(s1&s2)
print(s1.intersection(s2))
print(s1|s2)
print(s1.union(s2))
print(s1-s2)
print(s1.difference(s2))
s1.add(11)
s1.update([12,13,14])
s1.remove(13)
print(s1)
#boolean
a=True
b=False
print(type(s1))
print(type(a))
print(bool('apple'))
print(bool(''))
print(bool([1,2,3]))
print(bool([]))
print(bool({'a':1}))
print(bool({}))
print(bool(0))
print(bool(1))
print(bool(None))

a,b=(10,11)
a,b=('a','b')
(a,b)=22,33
[a,b]=[55,66]
a=b=13
print(a)
print(b)
a='alpha'
b='beta'
a,b=b,a
print(a)
print(b)
