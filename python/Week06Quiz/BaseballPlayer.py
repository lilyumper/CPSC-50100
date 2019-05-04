class BaseballPlayer:
    def __init__(self, fName,lName,number,position):
        self.firstName = fName
        self.lastName = lName
        self.number = number
        self.position = position

    def printBaseballPlayer(self):
        print(self.firstName,self.lastName,self.number,self.position)

x = BaseballPlayer("Sammy", "Sosa",23,"Right Field")
x.printBaseballPlayer()

class Pitcher(BaseballPlayer):
    def __init__(self,fName,lName,number,position, throws):
        BaseballPlayer.__init__(self,fName,lName,number, position)
        self.throws = throws


    def nowPitching(self):
        print (f'{self.firstName} {self.lastName} "is a" {self.throws} {self.position} "and wears number " {self.number}')


y = Pitcher("Kerry", "Wood", 34,"Pitcher","Right Handed")
y.nowPitching()
