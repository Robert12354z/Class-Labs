#Roberto Reyes
#CIN:305807806
#Course: CS-3035-01
#Description: This py file is the recurssion file that uses the process_digits function to
# recursively go through an integer until the integer reaches a single digit place
def main():
    number = int(input("Enter a integer: "))

    print(process_digits(number,add))
    print(process_digits(number,mult))

# Addition method that adds two integers
def add(x,y):
    return x+y

# Multiplication function that multiplies two integers
def mult(x,y):
    return x*y

# The process digits function takes any integer and uses whichever operation
def process_digits(n, operation):

    if n >= 10:
        x = operation(n%10 , process_digits(n//10, operation))
        return x
    else:
        return n

if __name__ == "__main__":
    main()