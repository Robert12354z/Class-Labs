#Roberto Reyes
#CIN:305807806
#Course: CS-3035-01

# Part 01 (1 point): For this problem you will generate lists of prime numbers
# given different sets of criteria.
#
# Create a callable object by implementing a class named CustomPrimes, the skeleton
# of which is given below.  In order to create a callable object, you must
# implement the __call__ method in the class.  This method should be implemented
# as a GENERATOR and its job is to generate all prime numbers from 2 to n (inclusive)
# that fit the criteria of one or more boolean functions. The list of function
# names will be passed into the constructor for the CustomPrimes class.
# Assume that the number of functions passed, could be any number.  You may not hardcode
# the number of functions.

# For this problem you do not need to use recursion as recursion can make this
# crash in python.  If you would like to use recursion for any of the boolean
# methods where the depth of recursion isn't too great feel free.

# Please see the comments given for the rest of the directions.

class CustomPrimes():
    def __init__(self, functions):
        self.functions = functions #Stores a list of function names

    def __call__(self, n):
        barrier = 10000+1
        var1= 0
        length = len(self.functions)
        for x in range(2,barrier):
            for y in range(length):
                if self.functions[y](x) == True:
                    var1 += 1
                else:
                    continue
                if var1 == length:
                    yield x
            if var1!= length:
                var1 =0









# The following functions are the boolean functions that will be passed into
# the constructor of the class.  Not all functions will be passed all the time.

# USE THIS FUNCTION AS IT IS
# This function returns true if p is prime, false otherwise.
# NOTE: If you find a better implementation of finding out if a number is prime
# or not, feel free to use it and let me know about it!
def is_prime(p):
    return [x for x in range(1,p+1) if p % x == 0] == [1,p]

def is_palindrome(p):
    string1 = str(p)

    if string1 == string1[::-1]:
        return True
    else:
        return False


def is_not_palindrome(p):
    string1 = str(p)

    if string1 != string1[::-1]:
        return True
    else:
        return False

def is_reverse_prime(p):
    reverse = 0
    while p>0:
        r = p %10
        reverse = reverse * 10 + r
        p = p//10

    return is_prime(reverse)

def is_twin_prime(p):
    added = p+2
    minus = p-2

    prime_added = is_prime(added)
    prime_minus = is_prime(minus)

    if prime_added or prime_minus is True:
        return True
    else:
        return False


def main():
    # In your main method you should generate the following types of prime numbers
    # using instances of your callable object class CustomPrimes.  For all lists
    # please demonstrate that your code works when N = 10000

    # Show all palindromic primes from 2 to 10000.  A number is a palindromic prime
    # if it is a prime number and also a palindrome.

    # Show all emirps.  An emirp is a nonpalindromic prime number whose
    # reversal is also prime.

    # Show all twin primes.  Twin primes are pairs of prime numbers that differ by 2.
    # Example, 3 and 5 are twin primes, 5 and 7 are twin primes, 11 and 13 are twin primes
    # and so on.

    # please display your output in a nice format.

    print("Palindromic Primes:")
    list_functions= [is_prime,is_palindrome]
    dumb= CustomPrimes(list_functions)
    print(list(dumb(10000)))

    print("\n"+"Emirps:")
    list_functions2 = [is_prime,is_not_palindrome,is_reverse_prime]
    dumb2 = CustomPrimes(list_functions2)
    print(list(dumb2(10000)))

    print("\n"+"Twin Primes:")
    list_functions3 = [is_prime,is_twin_prime]
    dumb3 = CustomPrimes(list_functions3)
    print(list(dumb3(10000)))


if __name__ == "__main__":
    main()
