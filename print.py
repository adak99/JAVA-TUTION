# a = list(map(int, input("Enter the value of a[]: ").split()))
# b = list(map(int, input("Enter the value of b[]: ").split()))
a = [1, 2, 3]
b = [1, 2, 3]
listEquals = True

if len(a) != len(b):
    listEquals = False
else:
    for i in range(len(a)):
        if a[i] != b[i]:
            listEquals = False
            break

if listEquals:
    print("{}".format(a))
    print("{}".format(b))
    print("EQUAL")
else:
    print("{}".format(a))
    print("{}".format(b))
    print("NOT EQUAL")
