def computeSum(comp240,comp205,comp206,comp226,comp250,comp270,comp210):
    sum = comp240+comp205+comp206+comp226+comp250+comp270+comp210
    return sum

#the execution of our main program starts here

kis = int(input("Kindly Enter marks"))
phy = int(input("Kindly Enter marks"))
soc = int(input("Kindly Enter marks"))
maths = int(input("Kindly Enter marks"))
Eng = int(input("Kindly Enter marks"))
Elec = int(input("Kindly Enter marks"))
cal = int(input("Kindly Enter marks"))
avg= computeSum(kis,phy,soc,maths,Eng,Elec,cal)/7
if avg >=80 and avg <100:
    print("you scored A1")
elif avg >= 70 and avg < 80:
    print("you scored A2")
elif avg >= 60 and avg < 70:
    print("you scored B1")
elif avg >= 50 and avg < 60:
    print("you scored B2")
elif avg >= 40 and avg < 50:
    print("you scored CA")
else:
    print("kindly continue eating and growing!")
    print(f"However, you did your best and scored: {avg:.2f}")