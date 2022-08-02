import random


abj = ["strong", "dark", "magic", "cool"]
words = ["gamer", "programmer", "tryharder", "mitico"]

print(abj[random.randint(0, len(abj))] + "-" + words[random.randint(0, len(words))] + str(random.randint(0, 23)))
