#include <stdio.h>

void towerOfHanoi(int n, char s, char h, char d) // char s = scorce, char h = helper , char d = destination
{
    if (n == 1)
    {
        printf("Transfer dis %d form %c to %c\n", n, s, d);
        return;
    }

    towerOfHanoi(n - 1, s, d, h);
    printf("Transfer dis %d form %c to %c\n", n, s, d);
    towerOfHanoi(n - 1, h, s, d);
}

int main()
{
    int n = 3;
    towerOfHanoi(n, 's', 'h', 'd');
    return 0;
}