def primeNumbers(input):
    count = 0
    for x in range(input, input + 11) :
        isPrime = True

        for y in range(2, x) :
            if x % y == 0:
                isPrime = False

        if isPrime and (count <= 10) :
            count +=1
            print(x)
            print(count, "count")

primeNumbers(5)