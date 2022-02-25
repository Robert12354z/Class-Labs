#Roberto Reyes
#CIN:305807806
#Course: CS-3035-01
#Description: This py file processes the txt file and convcerts them
#             into a list of words that appear in the txt file

import string

def txtProcess(filename):

    book = open(filename, encoding='UTF-8-sig')
    book_read= book.read()

    translation_table = book_read.maketrans(dict.fromkeys(string.punctuation + '“”’‘'+'—'))
    s2 = book_read.translate(translation_table)
    book_list = s2.split()

    for i in range(len(book_list)):
        book_list[i] = book_list[i].lower()

    return book_list





