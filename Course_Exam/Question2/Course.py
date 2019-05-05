class Course:
    def __init__(self, courseName, teacherName):
        self.courseName = courseName
        self.teacherName = teacherName

    def getInfo(self):
        a =1;
        for x in self:
            print('|%d|    %-30s|%30s|' % (a, x.courseName, x.teacherName))
            a += 1

