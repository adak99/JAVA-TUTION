n = 5

i = 1
while i <= n:
    # print space
    j = 1
    while j <= n - i:
        print(" ", end="")
        j += 1
    # print space
    k = 1
    while k <= n:
        print("*", end="")
        k += 1
    print()
    i += 1
