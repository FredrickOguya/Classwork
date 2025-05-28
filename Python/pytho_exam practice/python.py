def calculate_marks(marks):
    return sum(marks)/len(marks)

marks = []

for i in range(6):
    marks.append(float(input(f"Enter marks for unit {i+1}: ")))

average = calculate_marks(marks)

print(f"The total average is {average}")