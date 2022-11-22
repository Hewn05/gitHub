'''
예외처리
try:...
except 예외 : ...
except 예외 : ...
finally:
'''

try:
    10/0
except ZeroDivisionError as e :
    print(e)
finally:
    print('must run')
    
try:
    a = int(input("10~15사이 숫자 입력 : "))
    if a<10 or a>15:
    #   raise Exception("예외")
        raise ValueError
    print(a)

except:
    print("예외")
    
    
'''
예외처리
EAEP(Easier to Ask Forgiveness than Permission)
일단 하고 후에 처리         try catch 느낌
LBYL(Look Before You Leap)

'''

dic={'fruit':'apple', 'color':'red'}
#print(dic['price'])
print(dic.get('price'))
print('next')