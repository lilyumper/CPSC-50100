class ControlStatments():
    def _if_Demo(self, m: int):
        if (m > 10):
            print(f"Line True :m > 10")
        print("Line printed all times")

    def _if_else_Demo(self, m: int):
        if (m > 10):
            print(f"True  :m > 10")
        else:
            print(f"False :m <= 10")

    def _if_elif_else_Demo(self, m: int):
        if (m >= 90):
            grade = 'A'
        elif (m >= 80):
            grade = 'B'
        elif (m >= 70):
            grade = 'C'
        elif (m >= 60):
            grade = 'D'
        else:
            grade = 'F'

        print(f"Grade = %C%n",  grade)
