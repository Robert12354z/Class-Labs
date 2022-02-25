#Name: Roberto Reyes
#CIN:305807806

#User decides which value the for loop ends at
end_value= int(input('Enter an end value greater than 6: '))

#Fuction that checks to see if the number is a perfect num
def perfect_num(n):

    pSum= 0
    for i in range(1,n):
        if n%i==0:
            pSum+=i


    return pSum == n


#If statement checks to see if the value is greater than 6
if(end_value< 6):
    print('Error: Value must be greater than 6')
else:
    print('These are the perfect numbers starting from 6 to', end_value)
    #If the value is a PerfectNum it prints the value for user to see
    for i in range(6, end_value):
        if perfect_num(i):
            print(i," ")


