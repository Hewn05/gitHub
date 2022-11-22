import sys

#input and output
#a=input("입력하세요.:")
#print(a)
#print(type(a))
print("sdfsdf" "sd" "sdfsdfsd")
print("sdfsdf "+"sd "+"sdfsdfsd")

print("sdfsdf","sd","sdfsdfsd")

#file

#f = open("new.txt",'w')
#for i in range(10,100):
#    content = "%d line\n"%i
#    f.write(content)
#f.close()

#f=open("new.txt",'r')
#line=f.readline()
#print(line)
#f.close()
'''
f=open("new.txt",'r')
while True:
    line=f.readline()
    if not line: break
    print(line)
f.close()
'''
#f=open("new.txt",'r')
#lines=f.readlines()
#for line in lines:
#    line=line.strip()
#    print(line)
#f.close()

#f=open("new.txt",'r')
#content=f.read()
#print(content)
#f.close()

#f=open("new.txt",'a')
#for i in range(100,111):
#    content="%d line !!\n"%i
#    f.write(content)
#f.close()

#with open('new2.txt','w') as f:
#    f.write('here is test \n')

args = sys.argv[1:]
for i in args:
    print(i)
