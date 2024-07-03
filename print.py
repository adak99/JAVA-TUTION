n = 5
# m = 5

# upper part
for i in range(1, n + 1):
    for j in range(1, i + 1):
        print("*", end="")
    # print space
    space = int(2 * (n - i))
    for k in range(0, space):
        print(" ", end="")
    for l in range(1, i + 1):
        print("*", end="")
    print()
