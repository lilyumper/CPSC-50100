class Number():
  def arithmeticOperators(self):
    print("")
    print("Arithmetic Operators")
    print("Operator\tUse\t\tDescription")
    print("+\t\top1 + op2\tAdds op1 and op2")
    print("-\t\top1 - op2\tSubtracts op2 from op1")
    print("*\t\top1 * op2\tMultiplies op1 by op2")
    print("/\t\top1 / op2\tDivides op1 by op2")
    print("%\t\top1 % op2\tComputes the remainder of dividing op1 by op2")
    print("+=\t\top1 += op2\tAdds op1 and op2, result saved to op1")
    print("-=\t\top1 -= op2\tSubtracts op2 from op1, result saved to op1")
    print("*=\t\top1 *= op2\tMultiplies op1 by op2, result saved to op1")
    print("/=\t\top1 /= op2\tDivides op1 by op2, result saved to op1")
    print("%=\t\top1 %= op2\tComputes the remainder of dividing op1 by op2, result saved to op1")
    print("")

  def numericDataType(self) :
    print("")
    print("Numeric Data Types Operators")
    print("There are six numeric types four integer and two floating point")
    print("Type\tBytes\tRange")
    print("int\t4\t-2,147,483,648 to 2,147,483,647")
    print("long\t8\t-9,223,372,036,854,775,808 to 9,223,372,036,854,775,80")
    print("float\t4\t16 decimal digits.")
    print("complex\t4\t16 decimal digits.")
    print("")

  def demoInt(self,i:int,j:int) :
    print(f"")
    print(f"Interger Data Types Demo")
    # a few numbers
    print(f"Variable values...")
    print(f"    i = {i}")
    print(f"    j = {j}")
    # adding numbers
    print(f"Adding...")
    print(f"    i + j = {(i + j)}")
    # subtracting numbers
    print(f"Subtracting...")
    print(f"    i - j = {(i - j)}" )
    # multiplying numbers
    print(f"Multiplying...")
    print(f"    i * j = {(i * j)}")
    # dividing numbers
    print(f"Dividing...")
    print(f"    i / j = {(i / j)}")
    # computing the remainder resulting from dividing numbers
    print(f"Computing the remainder...")
    print(f"    i % j = {(i % j)}")

  def demoFloat(self,i:float,j:float):
    print(f"")
    print(f"Float Data Types Demo")
    print(f"Variable values...")
    print(f"    i = {i}")
    print(f"    j = {j}")
    # adding numbers
    print(f"Adding...")
    print(f"    i + j = {(i + j)}")
    # subtracting numbers
    print(f"Subtracting...")
    print(f"    i - j = {(i - j)}")
    # multiplying numbers
    print(f"Multiplying...")
    print(f"    i * j = {(i * j)}")
    # dividing numbers
    print(f"Dividing...")
    print(f"    i / j = {(i / j)}")
    # computing the remainder resulting from dividing numbers
    print(f"Computing the remainder...")
    print(f"    i % j = {(i % j)}")

  def demoComplex(self,i:complex,j:complex):
    print(f"")
    print(f"Complex Data Types Demo")
    print(f"Variable values...")
    print(f"    i = {i}")
    print(f"    j = {j}")
    # adding numbers
    print(f"Adding...")
    print(f"    i + j = {(i + j)}")
    # subtracting numbers
    print(f"Subtracting...")
    print(f"    i - j = {(i - j)}")
    # multiplying numbers
    print(f"Multiplying...")
    print(f"    i * j = {(i * j)}")
    # dividing numbers
    print(f"Dividing...")
    print(f"    i / j = {(i / j)}")

  def demoMix(self,i:int,j:float):
    print(f"")
    print(f"Mix Data Types Demo")
    print(f"Variable values...")
    print(f"    i = {i}")
    print(f"    j = {j}")
    # adding numbers
    print(f"Adding...")
    print(f"    i + j = {(i + j)}")
    # subtracting numbers
    print(f"Subtracting...")
    print(f"    i - j = {(i - j)}")
    # multiplying numbers
    print(f"Multiplying...")
    print(f"    i * j = {(i * j)}")
    # dividing numbers
    print(f"Dividing...")
    print(f"    i / j = {(i / j)}")
    # computing the remainder resulting from dividing numbers
    print(f"Computing the remainder...")
    print(f"    i % j = {(i % j)}")

  def covertFromString(self,input:str):
    print(f"")
    print(f"String to int")
    print(f"   string {input} => int {int(float(input))}")
    print(f"String to double")
    print(f"   string {input} => float {float(input)}")

