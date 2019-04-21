from ArrayDouble import ArrayDouble


def start():
    # Get random int
    arr = ArrayDouble.rand(20, -1, 1)
    # Print Array
    ArrayDouble.print(arr)
    # Sort Array
    print("Sort Array -------------------------")
    arr.sort()
    ArrayDouble.print(arr)
    print("filter > 0-------------------------")
    arr3 = filter(lambda c: c > 0, arr)
    ArrayDouble.print(arr3)
    print("filter <=0-------------------------")
    arr4 = filter(lambda c: c <= 0, arr)
    ArrayDouble.print(arr4)
    print("Sum -------------------------")
    sumValue = sum(arr)
    print(f"Sum = {sumValue:f}")


if __name__ == "__main__":
    start()
