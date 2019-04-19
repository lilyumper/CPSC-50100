from .Operators import Operators


class OperatorsRunner():
    def run(self):
        sample = Operators()
        sample.demoRelationalOp(10,15)
        sample.demoLogicalOp(12,10,18)
        sample.demoBitwiseOp(33,17)
