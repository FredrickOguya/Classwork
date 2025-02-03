#receiving the principle

principal = int(input("Enter the principal"))
Rate = int(input("Enter the rate"))
time = int(input("Enter the time"))
SI = principal*Rate*time/100
Total = principal+SI
print(f"The total amount is:{Total:.2f}")