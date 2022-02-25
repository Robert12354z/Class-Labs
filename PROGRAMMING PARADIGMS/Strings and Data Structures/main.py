#Roberto Reyes
#CIN:305807806
#Course: CS-3035-01
#Video Link: https://calstatela.instructuremedia.com/embed/eac3561f-5cd7-425c-bd45-35d4507bb15d
#Description: This py file is the main file that excutes all of the functions that are created within the other files
#             It also asks the user to input a string that is the name of the file in which it processes.


import dictionary_histogram
import list_histogram
import text_processing

def main():

    while True:
        filename = input("Input the .txt filename: ")
        file_ext = filename[-3:]
        if file_ext == 'txt':
            break
        else:
            print("File must be a .txt file")
            print(file_ext)

    txtList = text_processing.txtProcess(filename)

    dictionary_histogram.dictionset(txtList)
    print('')
    list_histogram.tuples_list(txtList)

if __name__ == "__main__":
    main()