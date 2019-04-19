from src.case01.HelloWorld import HelloWorld

class HelloWorldRunner():
    def run(self):
        sample = HelloWorld()
        sample.printHelloWorld()
        sample.printHelloWithInput('Tommy G ')
        sample.printHelloWithInput(10)
