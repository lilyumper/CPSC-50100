from .LoopDemo import LoopDemo


class LoopDemoRunner():
    def run(self):
        sample = LoopDemo()
        sample.demoForLoop()
        sample.demoWhileLoop()
        sample.demoForEachLoop()
        sample.demoContinueLoop()
        sample.demoBreakLoop()
