x = 2
y = 5
z = 22
#for while
for i in range (1, y +1):
    print(i)

while x <= z:
    print(x);
    x +=1


def breakIt():
    count = 2
    while (count < 10):
        if count == 8:
            print(count)
            break
        print("HERE")
        count+=1

def continueIt():
    for w in range(6):
        if w % 2 == 1:
            continue
        print(w)

breakIt()
continueIt()

cars = ["Honda","Chevy","Nissan"]

for k in cars:
    print(k)

if "Altima" in cars:
    print("Yep")
else:
    print ("nope")