#The program computes the volume and surface area

pie = 3.14

radius = int(input("Kindly enter the radius"))
height = int(input("Kindly input the height of the cylinder"))

#calculating the volume

volume = 2 * pie * radius**2

#calculating the Surface area

TSA= 2*radius*pie*(radius*height)

#output

print(f"The volume of the cylinder is:{volume:.2f} cubic metres")
print(f"The total surface area is: {TSA:.4f} square metres")