from ArrayInt import ArrayInt


def start():
    # Get random int
    arr = ArrayInt.rand(20, -10, 10)
    # Print List
    ArrayInt.print(arr)
    # Sort List
    print("Sort List -------------------------")
    arr.sort()
    ArrayInt.print(arr)
    print("filter > 0-------------------------")
    arr3 = filter(lambda c: c > 0, arr)
    ArrayInt.print(arr3)
    print("filter Even-------------------------")
    arr4 = filter(lambda c: c % 2 == 0, arr)
    ArrayInt.print(arr4)
    print("Sum-------------------------")
    sumValue = sum(arr)
    print(f"Sum = {sumValue:d}")


if __name__ == "__main__":
    start()
