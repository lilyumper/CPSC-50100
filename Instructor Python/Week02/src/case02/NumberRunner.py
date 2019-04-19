from .Number import Number
class NumberRunner():
    def run(self) :
        sample =Number()
        sample.arithmeticOperators()
        sample.numericDataType()
        sample.demoInt(456,23)
        sample.demoFloat(456.44,7.22)
        sample.demoComplex((3+4j),(5+1j))
        sample.demoMix(456,7.55)
        sample.covertFromString("2.3")