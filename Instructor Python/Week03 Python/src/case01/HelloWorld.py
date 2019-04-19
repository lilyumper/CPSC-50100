class HelloWorld():
    def __init__(self):
        self.__name: str = None

    def printHelloWorld(self):
        print('hello world\t--printHelloWorld')

    def printHelloWithInput(self, input):
        print(f'Hello {input}\t--printHelloWithInput')

    def printHelloHandleField(self):
        input = self.__name
        if input is None:
            input = "N/A"
        print(f"Hello {input}\t--printHelloHandleField")

    def __setName(self, value):
        self.__name = value

    def __getName(self):
        return self.__name

    name: str = property(__getName, __setName)


def Add(a, b):
    return a+b
