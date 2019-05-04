from Point import Point
import math


class Circle(Point):

    def __init__(self, x, y, r):
        super().__init__(x, y)
        self.r = r

    def __str__(self):
        return f"R={self.r} Center=" + super().__str__()

    def area(self):
        return math.pi * self.r*self.r
