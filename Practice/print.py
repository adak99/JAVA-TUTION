def towerOfHanoi(n, scorce, helper, destionation):
    if n == 1:
        print(f"Transfer disk {n} from {scorce} to {destionation}")
        return

    towerOfHanoi(n - 1, scorce, destionation, helper)
    print(f"Transfer disk {n} from {scorce} to {destionation}")
    towerOfHanoi(n - 1, helper, scorce, destionation)


def main():
    n = 3
    towerOfHanoi(n, "source", "helper", "destination")


if __name__ == "__main__":
    main()
