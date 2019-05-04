class Point:

    def __init__(self, x, y):
        self.x = x
        self.y = y

    def area(self):
        return 0

    def __str__(self):
        return f"({self.x:d},{self.y:d})"
