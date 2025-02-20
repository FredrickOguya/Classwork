import tkinter
from tkinter import messagebox


def onClick_submit():
    firstname_textbox.get()
    messagebox.showinfo("captured firstname")

root = tkinter.Tk()

root.minsize(450,350)
root.configure(bg="lightgreen")
root.title("Personal Information")
firstname_label = tkinter.Label(root, text="Enter your first Name")
firstname_label.pack(anchor=tkinter.W, padx=30)
firstname_textbox = tkinter.Entry(root)
firstname_textbox.pack(anchor=tkinter.W, padx=30)
secondname_label = tkinter.Label(root, text="Enter your Second Name")
secondname_label.pack(anchor=tkinter.W, padx=30)
secondname_textbox = tkinter.Entry(root)
secondname_textbox.pack(anchor=tkinter.W, padx=30)
surname_label = tkinter.Label(root, text="Enter your SurName")
surname_label.pack(anchor=tkinter.W, padx=30)
surname_textbox = tkinter.Entry(root)
surname_textbox.pack(anchor=tkinter.W, padx=30)
email_label = tkinter.Label(root, text="Enter your email")
email_label.pack(anchor=tkinter.W, padx=30)
email_textbox = tkinter.Entry(root)
email_textbox.pack(anchor=tkinter.W, padx=30)
submit_button=tkinter.Button(root, text="Submit",command=onClick_submit)
submit_button.pack(anchor=tkinter.W, padx=30)
root.mainloop()
