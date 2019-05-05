import random
def diceRoll(times):
    sum = 0
    ones = 0
    twos = 0
    threes = 0
    fours = 0
    fives = 0
    sixes = 0

    for x in range(times + 1):
        dice = random.randint(1,6)
        sum += dice

        if dice == 1:
            ones +=1
        if dice == 2:
            twos +=1
        if dice == 3:
            threes +=1
        if dice == 4:
            fours +=1
        if dice == 5:
            fives +=1
        if dice == 6:
            sixes +=1

    print(f"The sum of the total rolls is {sum}")
    print(f"The mean of the total rolls is {(sum/times)}")
    print("Each Number Occured This Many Times:")
    print(f"Ones: {ones}\n Twos: {twos}\n  Threes: {threes}\n  Fours:{fours}\n"
          f"fives: {fives}\n Sixes:{sixes}")



diceRoll(100)

