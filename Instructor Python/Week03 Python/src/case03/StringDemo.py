class StringDemo():
    def charArrayToString(self):
        print(f"")
        print("Array of char to string")
        helloArray = ['h', 'e', 'l', 'l', 'o', '.']
        helloString = "".join(helloArray)
        print(helloString)

    def stringConcat(self):
        print(f"")
        print(f"string Concatenating")
        str1 = "Hello"
        str2 = " "
        str3 = "Waleed A.K."
        str = str1 + str2 + str3
        print(str)
        str1 = ''.join([str1, str2, str3])
        print(str1)

    def formatString(self):
        print(f"")
        print(f"string Format using [String.Format]")
        str1 = f"The value of the float variable is {3.4}, while the value of the integer variable is {10}, and the string is {'Hi'}"
        print(str1)
