def print_fibo(a, b, n):
    if n == 0:
        return

    c = a + b
    print(f" {c}", end="")
    print_fibo(b, c, n - 1)


if __name__ == "__main__":
    a = 0
    b = 1
    print(f"{a} {b}", end="")
    print_fibo(a, b, 7 - 2)
