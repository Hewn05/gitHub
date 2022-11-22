#class.py
class Calculate:
#    pass
    def __init__(self, first, second):
        self.first = first
        self.second = second
        
    def setValue(self,first,second):
        self.first=first
        self.second=second
    
    def add(self):
        res=self.first + self.second
        return res
    
    def sub(self):
        res=self.first - self.second
        return res
    
    def mul(self):
        res=self.first * self.second
        return res
    
    def div(self):
        res=self.first / self.second
        return res
        
        
a=Calculate(4,2)
b=Calculate(7,3)
print(a is b)
print(type(a))

a.setValue(12,13)
Calculate.setValue(b,2,3)
print(a.first,a.second)
print(b.first,b.second)
print(a.add(),b.add())
print(a.sub(),b.sub())
print(a.mul(),b.mul())
print(a.div(),b.div())

class OtherCal(Calculate):
    def pow(self):
        return self.first**self.second

c = OtherCal(12,6)
print(c.add())
print(c.pow())

class ConditionCal(Calculate):
    def div(self):
        if self.second==0:
            return 'no div zero'
        else:
            return self.first/self.second

d = ConditionCal(2,0)
print(d.div())

class Things:
    what = 'animal'
    
print(Things.what)

e=Things()
f=Things()

print(e.what, f.what)
Things.what='baby'
print(e.what, f.what)
e.what='rock'
print(e.what, f.what)
