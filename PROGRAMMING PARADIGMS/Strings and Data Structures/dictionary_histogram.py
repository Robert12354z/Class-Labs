#Roberto Reyes
#CIN:305807806
#Course: CS-3035-01
#Description: This py file converts the list of words that it recieves from the main
#             and converts the words into a dictionary counting how many times the word repeats in the list

import time

def dictionset(book_list):
    word_dictionary = dict()
    book_list.sort()
    start = time.time()
    for i in book_list:
        if i in word_dictionary:
            word_dictionary[i] = word_dictionary[i]+1
        else:
            word_dictionary[i] =1
    end=time.time()
    final_time = end - start
    for key,value in word_dictionary.items():
        print(key,':',value)
    print("Number of words: %s" %len(word_dictionary))
    print("Dictionary runtime in seconds: %s " %(final_time))



