import random


abj = ["strong", "dark", "magic", "cool"]
words = ["gamer", "programmer", "tryharder", "mitico"]

randword = random.randint(0, 4)
randabj = random.randint(0,4)

username = abj[randabj] + "-" + words[randword] + str(random.randint(0, 23))

print(username)
