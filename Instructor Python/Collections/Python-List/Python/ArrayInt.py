import random


class ArrayInt(object):
    @staticmethod
    def rand(size, low, high):
        array = []
        for _ in range(0, size):
            array.append(random.random(low, high))
        return array

    @staticmethod
    def print(array):
        index = 0
        for item in array:
            print(f" index={index:3d} ==>  Value ={item:3d} ")
            index += 1
        return array
