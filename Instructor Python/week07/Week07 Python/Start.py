from Point import Point
from Circle import Circle
from Square import Square


def start():
    p = Point(3, 4)
    print(p)
    p.x = 10
    print(p)
    print(f"Area= {p.area()}")

    c = Circle(3, 4, 5)
    print(c)
    c.r = 10
    print(c)
    print(f"Area= {c.area()}")

    sq = Square(3, 4, 5)
    print(sq)
    sq.y = 10
    print(sq)
    print(f"Area= {sq.area()}")


if __name__ == "__main__":
    start()
