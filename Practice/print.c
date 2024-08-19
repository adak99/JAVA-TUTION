#include <stdio.h>
#include <string.h>

void reverseStr(char str[], int index)
{
    if (index == 0)
    {
        printf("%c ", str[index]);
        return;
    }

    printf("%c ", str[index]);
    reverseStr(str, index - 1);
}

int main()
{
    char str[] = "ABCD";

    reverseStr(str, strlen(str) - 1);

    return 0;
}