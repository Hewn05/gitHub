#import module
#print(module.say())
#print(module.add())

#from module import say, add
#from module import *
#print(say())
#print(add(2,4))

from website.sound.echo import echo_sound
from website.view.rendering import rendering
echo_sound()
rendering()