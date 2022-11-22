#if
money=4000
hidden=5000
if money>=5000 or hidden >=3000:
    print('사먹기')
else:
    print('안먹기')

a=[1,2,3,4]
if 10 in a:
    print("있다.")
else:
    print('없다')

if money>=5000: print('사먹기')
elif hidden >=3000:print('비상금')
else:print('안먹기')
#조건부 표현식
score=80
if score>50:
    grade="pass"
else:
    grade="fail"
    
grade="pass"if score>=90 else "fail"
print(grade)

#while
i=0
while i<10:
    i+=1
    print(i)

num=3
while num !=3:
    print("""
          1.continue
          2.continue
          3.exit
          enter :
          """)
    num = int(input())
num=0
while num<10:
    num+=1
    if num%2==0: 
        continue
    print(num)

#for
list1 = [31,54,32,45]
for i in list1:
    if i>40:
        continue
    print(i)

sum=0    
for i in range(1,101):
    sum += i
print(sum)

for i in range(len(list1)):
    print(i)

for i in range(2,10):
    for j in range(1,10):
        print('%d * %d = %d'%(i,j,i*j),end=" ")
        print(str(i)+'*'+str(j)+'='+str(i*j))
    print('')
#for list 내포식 [ 처리식 for 변수 in 반복가능객체 if 조건문]
l1=[1,2,3,4,5]
res=[]
for i in l1:
    if i%2==0:
        res.append(i+2)
print(res)

res1=[i*2 for i in l1 if i%2==0]
print(res1)

res2=[i*j for i in range(2,10) for j in range(1,10)]
print(res2)