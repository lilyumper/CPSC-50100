def sumDigits(n):
    if n == 0:
        return 0
    sum = (n % 10) + sumDigits(n // 10)

    print(f"Sum of digits in {n} is {sum}")
    return sum


sumDigits(126)

# I have found that // disregards the remainder
