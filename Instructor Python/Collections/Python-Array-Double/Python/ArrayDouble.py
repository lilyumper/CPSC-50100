import random


class ArrayDouble(object):
    @staticmethod
    def rand(size, low, high):
        array = []
        for _ in range(0, size):
            array.append(random.uniform(low, high))
        return array

    @staticmethod
    def print(array):
        index = 0
        for item in array:
            print(f" index={index:3d} ==>  Value ={item:5f} ")
            index += 1
        return array
