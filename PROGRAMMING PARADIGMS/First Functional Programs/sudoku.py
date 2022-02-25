from math import floor
#Takes in 2D List representing the board and outputs it to the console as a sudoku board
def print_sudoku(board):
	if len(board) != 9:
		print("ERROR, Invalid board passed to print_sudoku")
	for row in range(9):
		if len(board[row]) != 9:
			print("ERROR, Invalid board passed to print_sudoku")
		if row % 3 == 0 and row != 0:
			print("---------------------")
		line = ""
		for col in range(9):
			if col % 3 == 0 and col != 0:
				line = line + "| "
			if board[row][col] is None:
				line = line + "* "
			else:
				line = line + str(board[row][col]) + " "
		print(line)

def getNumbers(board, row, col):
	rejected =[]
	for i in range(9):
		if board[row][i] != None:
			rejected.append(board[row][i])
		if board[i][col] != None:
			rejected.append(board[i][col])

	top = (floor(row / 3)) *3
	bot = (floor(col/3))*3

	for i in range(3):
		for j in range(3):
			if(board[top + i][bot + j] != None):
				rejected.append(board[top + i][bot + j])
	return rejected





#Takes in 2D List representing the board and returns True if the problem is solved in a valid way
def check_sudoku(board):
	domain = [1, 2, 3, 4, 5, 6, 7, 8, 9]
	#Check there are no empty cells
	for row in board:
		for col in row:
			if col not in domain:
				return False

	#Check rows for AllDiff
	for row in board:
		if len(row) != len(set(row)):
			return False

	#Check cols for AllDiff
	for i in range(9):
		col = [row[i] for row  in board]
		if len(col) != len(set(col)):
			return False

	#Check subsquare for AllDiff
	for i in range(3):
		for j in range(3):
			subsquare = [board[3*i][3*j], 	  board[3*i][3*j + 1], 	   board[3*i][3*j + 2],
						 board[3*i + 1][3*j], board[3*i + 1][3*j + 1], board[3*i + 1][3*j + 2],
						 board[3*i + 2][3*j], board[3*i + 2][3*j + 1], board[3*i + 2][3*j + 2]]
			if len(subsquare) != len(set(subsquare)):
				return False
	return True

#Takes in 2D List representing the board and fills in empty/None squares using AC3
def solve_sudoku(board):
	if check_sudoku(board):
		return True

	while check_sudoku(board) is not True:
		for i in range(9):
			for j in range(9):
				if board[i][j] is None:
					domain = [1, 2, 3, 4, 5, 6, 7, 8, 9]
					numbers = getNumbers(board, i, j)
					for a in numbers:
						if a in domain:
							domain.remove(a)
						if len(domain) == 1:
							board[i][j] = domain[0]






problem1 = [[None, None, 3   , None, 2   , None, 6   , None, None],
			[9   , None, None, 3   , None, 5   , None, None, 1   ],
			[None, None, 1   , 8   , None, 6   , 4   , None, None],
			[None, None, 8   , 1   , None, 2   , 9   , None, None],
			[7   , None, None, None, None, None, None, None, 8   ],
			[None, None, 6   , 7   , None, 8   , 2   , None, None],
			[None, None, 2   , 6   , None, 9   , 5   , None, None],
			[8   , None, None, 2   , None, 3   , None, None, 9   ],
			[None, None, 5   , None, 1   , None, 3   , None, None]]

problem2 = [[None, 1   , 3   , 4   , 2   , None, None, 8   , 6   ],
			[2   , None, 4   , 6   , None, None, None, None, None],
			[None, 8   , 7   , None, 1   , None, 3   , None, None],
			[None, None, None, None, 3   , None, 6   , None, None],
			[None, 6   , 2   , 5   , None, None, None, None, 3   ],
			[5   , None, None, 7   , 6   , 4   , None, 9   , 1   ],
			[7   , None, None, None, 4   , None, 8   , 1   , None],
			[None, 4   , None, 8   , None, None, None, 6   , None],
			[None, None, 1   , 2   , 5   , 6   , None, 3   , 7   ]]

problem3 = [[6   , None, None, None, None, 7   , None, 2   , None],
			[None, None, None, None, None, None, None, 1   , 5   ],
			[2   , 4   , 9   , None, 1   , None, None, None, 3   ],
			[4   , None, 5   , 8   , None, 1   , 3   , 9   , None],
			[3   , 8   , None, None, 4   , 9   , None, None, None],
			[None, 1   , 6   , None, 7   , None, None, None, None],
			[8   , None, 4   , 1   , 5   , 3   , 6   , None, 2   ],
			[None, None, None, None, 6   , 4   , 8   , 3   , None],
			[1   , 6   , None, None, None, 2   , None, None, 9   ]]

print_sudoku(problem1)
solve_sudoku(problem1)
print(check_sudoku(problem1))
print_sudoku(problem1)
print("")

print_sudoku(problem2)
solve_sudoku(problem2)
print(check_sudoku(problem2))
print_sudoku(problem2)
print("")

print_sudoku(problem3)
solve_sudoku(problem3)
print(check_sudoku(problem3))
print_sudoku(problem3)
print("")
