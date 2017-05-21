import random

if __name__ == '__main__':
    flips = int(input("Please enter a number of flips\n"))
    heads = 0
    tails = 0
    for i in range(0, flips):
        randomNum = random.randrange(1,3)
        if randomNum == 1:
            heads += 1
            print("Heads. Heads = "+str(heads)+" | Tails = "+str(tails)+" | Total Flips = "+str(i+1))
        else:
            tails += 1
            print("Tails. Heads = "+str(heads)+" | Tails = "+str(tails)+" | Total Flips = "+str(i+1))
