input1=int(input("Please input the first number: "))
input2=int(input("please input the second number: "))
sign=input("please input the operation to be performed: ")

if(sign == "+"):
    answer = input1 + input2
elif(sign == "-"):
    answer = input1-input2
elif(sign == "/"):
    answer = input1/input2
elif(sign == "*"):
    answer = input1*input2
print(f"your answer is {answer}")