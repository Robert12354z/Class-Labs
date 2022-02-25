#Name: Roberto Reyes
#CIN:203807805
#COURSE: CS-3035-01
#Description: An object class that immitated a vector and performed vector math such as cross product
#Link to Video: https://calstatela.instructuremedia.com/embed/9da96c2d-48a5-4cbd-b2a9-5b60cb1aa089

import math

#---------------------Class Constructors and Instance Data----------------------
#In the class below we create a vector that has three parameters that represent the three values
#found within vector

#Below are two constructors that represent one with inputted values and one that is a blank constructor.
class Vector:
    __a=0
    __b=0
    __c=0

    def __init__(self,a=1,b=1,c=1):
        self.__a=a
        self.__b=b
        self.__c=c

    def set_vector(self,a,b,c):
        self.__a=a
        self.__b=b
        self.__c=c

    #-----------------------------Methods---------------------------------------------

    """
    Description: Both of these methods overload the string operator and a debugging representation

    Parameters
    ----------
    arg_1: expected type: vector object

    Returns
    -------
    Returns a string of the vector with its parameters    
    """

    def __str__(self):
        """
        >>> obj = Vector(1,2,3)
        >>> print(obj.__str__())
        <1,2,3>

        """
        return "<" + str(self.__a) + "," + str(self.__b) + "," + str(self.__c) + ">"

    def __repr__(self):
        """
         >>> obj = Vector(1,2,3)
         >>> print(obj.__repr__())
         Vector(1,2,3)

        """
        return "Vector(" +  str(self.__a) + "," + str(self.__b) +  "," + str(self.__c) + ")"

    """
     Description: The magnitude method calculates the magnitude of a vector 

     Parameters
     ----------
     arg_1: expected type: vector object

     Returns
     -------
     Returns a value by taking the magnitude of the vector  
     """

    """
     Description: The equals method overloads the == operator and checks to see if both vectors
                  are equal to each other based of the three values in the vector

     Parameters
     ----------
     arg_1: expected type: vector object
     arg_2: expected type: vector object

     Returns
     -------
     Returns either true or false depending on whether both objects equal each other
     """

    def magnitude(self):
        """
          >>> obj = Vector(1,2,3)
          >>> print(obj.magnitude())
          3.7416573867739413

        """
        d=self.__a ** 2
        e=self.__b ** 2
        f= self.__c ** 2

        added = d+e+f

        answer = math.sqrt(added)

        return answer

    """
     Description: The equals method overloads the == operator and checks to see if both vectors
                  are equal to each other based of the three values in the vector

     Parameters
     ----------
     arg_1: expected type: vector object
     arg_2: expected type: vector object

     Returns
     -------
     Returns either true or false depending on whether both objects equal each other
     """

    def __eq__(self,other):
        """
        >>> obj = Vector(1,2,3)
        >>> obj1 = Vector(1,2,3)
        >>> print(obj == obj1)
        True

        """
        if isinstance(other,Vector):
            return self.__a == other.__a and self.__b == other.__b and other.__c == self.__c

        return False

    """
     Description: The add method overloads the + operator and adds both vectors based off its a,b,c parameters and returns a new vector

     Parameters
     ----------
     arg_1: expected type: vector object
     arg_2: expected type: vector object

     Returns
     -------
     Returns a new vector obj with the new added parameters
     """

    def __add__(self, other):
        """
        >>> obj = Vector(1,2,3)
        >>> obj1 = Vector(1,2,3)
        >>> print(obj + obj1)
        <2,4,6>

        """
        a = self.__a + other.__a
        b = self.__b + other.__b
        c = self.__c + other.__c

        obj = Vector(a,b,c)

        return obj

    """
     Description: The iadd overloads the += operator and adds the both vectors and returns the value back to the vector from the left

     Parameters
     ----------
     arg_1: expected type: vector object
     arg_2: expected type: vector object

     Returns
     -------
     Returns arg_1 with new parameter values
     """
    def __iadd__(self, other):
        """
        >>> obj = Vector(1,2,3)
        >>> obj1 = Vector(1,2,3)
        >>> print(obj.__iadd__(obj1))
        <2,4,6>

        """

        self.__a += other.__a
        self.__b += other.__b
        self.__c += other.__c
        return self

    """
     Description: The sub method overloads the - operator and subtracts both vectors parameters and returns a new vector based off the subtraction

     Parameters
     ----------
     arg_1: expected type: vector object
     arg_2: expected type: vector object

     Returns
     -------
     Returns a vector object that has the parameters from arg_1 and arg_2 subtracted
     """

    def __sub__(self, other):
        """
        >>> obj = Vector(1,2,3)
        >>> obj1 = Vector(1,2,3)
        >>> print(obj - obj1)
        <0,0,0>

        """

        a = self.__a - other.__a
        b = self.__b - other.__b
        c = self.__c - other.__c

        obj = Vector(a, b, c)

        return obj

    """
     Description: The isub method overloads the -= operator and subtracts both vectors parameters from each other and returns the vectors on the left

     Parameters
     ----------
     arg_1: expected type: vector object
     arg_2: expected type: vector object

     Returns
     -------
     Returns arg_1 that has the parameters from arg_1 and arg_2 subtracted
     """

    def __isub__(self, other):
        """
        >>> obj = Vector(1,2,3)
        >>> obj1 = Vector(1,2,3)
        >>> print(obj.__isub__(obj1))
        <0,0,0>

        """

        self.__a -= other.__a
        self.__b -= other.__b
        self.__c -= other.__c
        return self

    """
     Description: The multiplication method overloads the * method and proocess an isinstance method to verify whether the other variable is a vector or an int
                  Then after verfying which parameter, calculates based each formula

     Parameters
     ----------
     arg_1: expected type: vector object
     arg_2: expected type: vector object or int variable

     Returns
     -------
     Returns arg_1 that has the parameters from arg_1 and arg_2 multiplied using cross product as an integer or returns vector multiplied using integer 
     """

    def __mul__(self, other):
        """
        >>> obj = Vector(1,2,3)
        >>> obj1 = Vector(1,2,3)
        >>> print(obj * obj1)
        14

        """
        if isinstance(other, Vector):
            a = self.__a * other.__a
            b = self.__b * other.__b
            c = self.__c * other.__c

            fin = a+b+c

            return fin

        if isinstance(other, int):
            a = self.__a * other
            b = self.__b * other
            c = self.__c * other

            obj = Vector(a,b,c)
            return obj

    """
     Description: The multiplication method overloads the *=  method and proocess an isinstance method to verify whether the variable is an int
                  Then after verfying the parameter, calculates based each formula

     Parameters
     ----------
     arg_1: expected type: vector object
     arg_2: expected type: vector object or int variable

     Returns
     -------
     Returns arg_1  multiplied using integer 
     """

    def __imul__(self, other):
        """
        >>> obj = Vector(1,2,3)
        >>> obj1 = 2
        >>> print(obj.__imul__(obj1))
        <2,4,6>
        """
        if isinstance(other, int):
            self.__a *= other
            self.__b *= other
            self.__c *= other
            return self
        else:
            return False

    """
     Description: The mod method overloads the % method and performs a cross product of both vectors and returns a new vector object

     Parameters
     ----------
     arg_1: expected type: vector object
     arg_2: expected type: vector object 

     Returns
     -------
     Returns a new vector object
     """

    def __mod__(self, other):
        """
        >>> obj = Vector(1,2,3)
        >>> obj1 = Vector(1,2,3)
        >>> print(obj.__mod__(obj1))
        <0,0,0>
        """
        a = (self.__b * other.__c) - (self.__c * other.__b)
        b = (self.__c * other.__a) - (self.__a * other.__c)
        c = (self.__a * other.__b) - (self.__b * other.__a)


        obj = Vector(a, b, c)

        return obj

    def __getitem__(self, item):
        if(item == 0):
            return self.__a
        if(item == 1):
            return self.__b
        if(item == 2):
            return self.__c

    def __setitem__(self, key, value):
        if (key == 0):
            self.__a = value
        if (key == 1):
            self.__b = value
        if (key == 2):
            self.__c = value







