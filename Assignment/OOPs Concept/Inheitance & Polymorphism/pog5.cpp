class Students:
    def __init__(self, roll_number):
        self.roll_number = roll_number

class Test(Students):
    def __init__(self, roll_number, subject1_marks, subject2_marks):
        super().__init__(roll_number)
        self.subject1_marks = subject1_marks
        self.subject2_marks = subject2_marks

class Result(Test):
    def __init__(self, roll_number, subject1_marks, subject2_marks):
        super().__init__(roll_number, subject1_marks, subject2_marks)
        self.total_marks = subject1_marks + subject2_marks

# Example usage
student1 = Result('A 36', 85, 90)
print(student1.roll_number)  # Output: A 36
print(student1.total_marks)  # Output: 175
