#Roberto Reyes
#CIN:305807806
#Course: CS-3035-01
#Description: This py file converts the words list into a dictionary then into a list of tuples

import time
def tuples_list(book_list):
    word_dictionary = dict()
    book_list.sort()
    start = time.time()
    for i in book_list:
        if i in word_dictionary:
            word_dictionary[i] = word_dictionary[i] + 1
        else:
            word_dictionary[i] = 1

    copyD= word_dictionary.items()
    tupleList= list(copyD)
    end = time.time()
    final_time = end - start
    for i in tupleList:
        print(i)

    print("Number of words: %s" % len(tupleList))
    print("Tuples runtime in seconds: %s " % (final_time))



