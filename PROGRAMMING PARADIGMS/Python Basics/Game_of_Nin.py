#Name: Roberto Reyes
#CIN: 305807806

from random import randrange

game_pile=0
coinflip_choice=0
comp_smartness=1

def generate_rand_pile():
  global game_pile
  game_pile = randrange(10,101)
  
def coinflip():
  global coinflip_choice
  coinflip_choice = randrange(0,2)
  
def style_of_play():
  global comp_smartness
  comp_smartness = randrange(0,2)    
  
def play_dumb():
  global game_pile 
  if (game_pile % 2)==0:
    take_amount = randrange(0,game_pile/2)
    if take_amount == 0:
      take_amount+=1
  else:
    take_amount = randrange(1, (1+game_pile)/2)              
  print('Computer will take:', take_amount)
  new_pile = int(game_pile - take_amount)
  game_pile=new_pile
  
def play_smart():
  global game_pile

  slist = [63,31,15,7,3]

  if (game_pile < 6):
    if(game_pile  %2) == 0:
      take_amount = randrange(0, game_pile/2)
      if take_amount == 0:
        take_amount=1
    else:
      take_amount = randrange(1, (1 + game_pile) / 2)
    print('Computer will take:', take_amount)
    new_pile = int(game_pile - take_amount)
    game_pile = new_pile

  if (game_pile > 6):
    x = 0
    while True:
      if (game_pile>= slist[i]):
        take_amount = game_pile - slist[i]
        game_pile = game_pile - take_amount
        print("Comp takes ",take_amount)
        break
      x= x+ 1


generate_rand_pile()
coinflip()
style_of_play()


if comp_smartness == 0:
  print("I will play dumb")
  if coinflip_choice == 0:
    while True:
      print('This is how many marbles are left: ', game_pile)
      play_dumb()
      if game_pile == 1:
        print("The winner is computer")
        break
      print('This is how many marbles are left:' ,game_pile)
      while True:
        human_pile =(int(input("How many marbels do you wanna take? ")))
        if human_pile < 1 or human_pile > (game_pile/2):
          print("illegal move")
        else:
          break

      new_pile = int(game_pile - human_pile)
      game_pile = int(new_pile)
      if game_pile == 1:
       print("The human has won") 
       break  
       
       
  if coinflip_choice == 1:
    while True:
     print('This is how many marbles are left:' ,game_pile)

     while True:
       human_pile= (int(input("How many marbels do you wanna take? ")))
       if human_pile < 1 or human_pile > (game_pile/2):
         print("illegal move")
       else:
         break
     new_pile = int(game_pile - human_pile)
     game_pile = int(new_pile)
     if game_pile == 1:
       print("The human has won") 
       break
     play_dumb()
     if game_pile == 1:
       print("The winner is Computer")
       break


if comp_smartness == 1:
   print('I will play smart')

   if coinflip_choice == 1:
      while True:
        print('This is how many marbles are left: ', game_pile)
        while True:
          human_pile =(int(input("How many marbels do you wanna take? ")))
          if human_pile<1 or human_pile>(game_pile/2):
            print("illegal move")
          else:
            break
        new_pile = int(game_pile - human_pile)
        game_pile = int(new_pile)
        if game_pile == 1:
          print("The human has won")
          break
        print('This is how many marbles are left: ', game_pile)
        play_smart()
        if game_pile == 1:
          print('The computer has won!!!')
          break  
              
   if coinflip_choice == 0:
      while True:
        print('This is how many marbles are left: ', game_pile)
        play_smart()
        if game_pile == 1:
          print('The computer has won!!!')
          break
        print('This is how many marbles are left: ', game_pile)
        while True:
          human_pile =(int(input("How many marbels do you wanna take? ")))
          if human_pile<1 or human_pile>(game_pile/2):
            print("illegal move")
          else:
            break
        new_pile = int(game_pile - human_pile)
        game_pile = int(new_pile)
        if game_pile == 1:
          print("The human has won")
          break 
             
       
     
