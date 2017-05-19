if __name__ == '__main__':
    print("What conversion would you like?")
    print("1: Fahrenheit to Celsius")
    print("2: Celsius to Fahrenheit")
    option = int(input())

    if(option < 1 or option > 2):
        print("Please run again with a valid input from 1-2.")
        exit()

    value = int(input("Please type the value to convert:"))
    unit = ""

    if option == 1:
        value -= 32
        value *= 5
        value /= 9
        unit = " Celsius"

    if option == 2:
        value *= 9
        value /= 5
        value += 32
        unit = " Fahrenheit"

    print("Your result is "+str(value)+str(unit))
