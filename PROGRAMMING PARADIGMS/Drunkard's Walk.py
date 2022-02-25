#Name: Roberto Reyes
#CIN:203807805

from random import randrange
#this relates the starting coordinates of the man who had a nice night
x_coordinate= 0
y_coordinate= 0

#Asks users how many steps the drunk man takes
steps = int(input('Enter the number of steps the drunk man takes: '))

#all the actions the drunk man can take
def north():
    global x_coordinate
    x_coordinate += 1

def south():
    global x_coordinate
    x_coordinate -= 1

def east():
    global y_coordinate
    y_coordinate += 1

def west():
    global y_coordinate
    y_coordinate -= 1

#Depending on how many steps the user states, the drunk will randomly choose which direction
for x in range(steps):
    #This variable selects a random number from 1-4
    choice = randrange(1, 5)

    if choice == 1:
        north()
        print('He went North', '(', x_coordinate, ',', y_coordinate, ')')

    if choice == 2:
        south()
        print('He went South', '(', x_coordinate, ',', y_coordinate, ')')

    if choice == 3:
        east()
        print('He went East', '(', x_coordinate, ',', y_coordinate, ')')

    if choice == 4:
        west()
        print("He went West", '(', x_coordinate, ',', y_coordinate, ')')


