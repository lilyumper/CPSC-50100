def factorial(x):
    if x == 1:
        print(f'x is equal to {x}')
        return 1

    result = x * factorial(x - 1)

    print(f": {x} getFactorial ({x} - 1)")
    print(f"Result is: {result}")
    return result


factorial(8)
