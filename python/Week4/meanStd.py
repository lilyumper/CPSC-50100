import math

def findMean(array):
    sum = 0
    count = 0
    avg = 0
    for x in array:
        sum += x
        count +=1
        print(f'count: {count}')
        print(f'Sum: {sum}')

    avg = (sum/count)
    print(f'avg:{avg}')
    return avg

# findMean([22.2,22.1,1.25,1.46])


def std(array):
    sum = 0
    length = len(array)
    mean = findMean(array)
    result = 0

    for x in array:
        sum+= math.pow((x - mean), 2)
        print(f'sum: {sum}')

    result = math.sqrt(sum/length)
    print(f'Standard Deviation: {result}')
    return result


std([10.25,20.33,21.45,30.45,17.25])