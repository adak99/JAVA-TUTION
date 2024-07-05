n = 5

# Upper part
for i in range(n + 1):
    for j in range(0, n - i):
        print(" ", end="")
    for k in range(1, i + 1):
        print(" *", end="")
    print("")
    
for l in range(n,-1,1)
