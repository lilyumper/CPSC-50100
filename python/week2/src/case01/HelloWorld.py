class HelloWorld():
    def __init__(self):
        self._name: str = None

    def printHelloWorld(self):
        print('hello world\t--printHelloWorld')
    
    def printHelloWithInput(self, input): 
        print(f'Hello {input}\t--printHelloWorldInput')

    def printHelloHandleField(self):
        input = self._name
        if input is None:
            input = "N/A"
        print(f'Hello {input}\t--printHelloHandleField')

    def __setName(self, value):
        self._name = value
    
    def __getName(self):
        return self._name

    name:str = property(__getName, __setName)
    