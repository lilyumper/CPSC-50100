class LoopDemo():
    def demoForLoop(self):
        print(f"")
        print(f"For Loop Demo")
        for i in range(1, 10):
            print(f" i = \t {i}")

    def demoWhileLoop(self):
        print(f"")
        print(f"While Loop Demo")
        i = 0
        while (i < 10):
            print(f" i = \t{i}")
            i += 1

    def demoForEachLoop(self):
        print(f"")
        print(f"For Each Loop Demo")
        iterable = [1, 2, 3, 5, 6, 7, 9, 0]
        for i in iterable:
            print(f" i = \t{i}")

    def demoContinueLoop(self):
        print(f"")
        print(f"Continue Demo")
        print(f"you can use continue in any loop type it jump the statment to the begin of the loop ")
        i = -1
        while (i < 10):
            i += 1
            if (i % 2 == 0):
                continue
            print(f" i = \t{i}")

    def demoBreakLoop(self):
        print(f"")
        print(f"Break Demo")
        print(f"you can use break in any loop type it jump the statment outside the loop ")
        i = 0
        while (i < 10):
            if (i == 5):
                break
            print(f" i = \t{i}")
            i += 1
