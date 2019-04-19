from .HelloWorld import HelloWorld,Add
class HelloWorldRunner():
    def run(self):
        sample = HelloWorld()
        sample.printHelloWorld()
        sample.printHelloWithInput('Waleed A.k')
        sample.printHelloWithInput(10)
        sample.printHelloHandleField()
        sample.name="Waleed A.K."
        sample.printHelloHandleField()