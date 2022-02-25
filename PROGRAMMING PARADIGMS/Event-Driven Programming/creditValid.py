#Roberto Reyes
#CIN:305807806
#Course: CS-3035-01
#Description: This py file is a gui that uses two central functions to validate a credit card number

from tkinter import *
from tkinter import messagebox

#Validator checks to see which type of card it is
#and to see whether the card is valid using searchSecondDigit method
def vali():

    if 13> len(txt.get()) < 16:
        return messagebox.showinfo(title= 'Error', message = 'Your credit card is under 13 or over 16 numbers')
    else:
        num = searchSecondDigit(txt.get())
        text = txt.get()


        if(num % 10 == 0) and text[0] == '4' :
            return messagebox.showinfo(title = 'Final', message= 'Your credit card is valid and is a Visa')

        elif (num % 10 == 0) and text[0] == '5' :
            return messagebox.showinfo(title='Final', message='Your credit card is valid and is a MasterCard')

        elif (num % 10 == 0) and text[0] == '3' and text[1] == '7' :
            return messagebox.showinfo(title='Final', message='Your credit card is valid and is a American Express')

        elif (num % 10 == 0) and text[0] == '6' :
            return messagebox.showinfo(title='Final', message='Your credit card is valid and is a Discover Card')

        else:
            return messagebox.showinfo(title = 'Error', message = 'Your credit card is not valid')



#This method takes the odds and evens of the card number.
# For the evens of the numbers it doubles the number than adds it to itself.
#if the digit is a double digit it adds the two together into one.
# For odd it adds all values together with no altering

def searchSecondDigit(num):

    #reverse the order of the string
    revOrder = num[::-1]
    #removes first number
    revOrder2 = revOrder[1:]


    even = revOrder2[::2]
    odd = revOrder[::2]

    listEven=[]
    listOdd=[]

    listEven[:0]=even
    listOdd[:0]=odd
    b = []
    c=[]
    totalOdd=0
    totalEven= 0

#odd
    for i in range(0, len(listOdd)):

        dou = int(listOdd[i])
        c.append(dou)

    for i in range(0,len(c)):
        totalOdd += c[i]
#even
    for i in range(0, len(listEven)):

        dou2 = int(listEven[i]) * 2
        b.append(dou2)

    for i in range(0,len(b)):


        if b[i]>=10:
            test = list(str(b[i]))
            totalEven+=(int(test[1]) + int(test[0]))

        else:
            totalEven += b[i]

    fin = (totalEven + totalOdd)

    return fin


#Gui
window = Tk()
#Label
lb= Label(window, text = "Credit Card Validator", fg= 'black',font=('Helvetica',16))
lb.place(x=50,y=50)
#Text Entry
txt= Entry(window,bd =5)
txt.place(x=80, y=100)
#Validate Button
validate_button = Button(window, text="Validate", command=vali)
validate_button.place(x=120, y=150)
#Title for window of GUI
window.title("Credit Card Validator")
window.geometry("300x200+10+10")

window.mainloop()