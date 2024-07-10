def calcualte_factoral(n):
    if n == 0 or n == 1:
        return 1

    fact_number = calcualte_factoral(n - 1)
    result = n * fact_number
    return result


n = 5
result = calcualte_factoral(n)
print(n, "factorial is: ", result)
