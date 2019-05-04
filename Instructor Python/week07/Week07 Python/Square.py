from Point import Point


class Square(Point):

    def __init__(self, x, y, s):
        super().__init__(x, y)
        self.s = s

    def __str__(self):
        return f"Sides={self.s} LeftTop=" + super().__str__()

    def area(self):
        return self.s*self.s
