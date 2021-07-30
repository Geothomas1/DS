#include <stdio.h>
int func1(int a)
{
    return a + 1;
}
int func2(int a)
{
    int b = 0;
    for (b = 0; b <= a; b = b + 1)
    {
        if (b < a)
        {
            printf("#");
        }
        else
        {
            printf("*");
        }
    }
    return a;
}
int func3(int a)
{
    return a - 1;
}
void main()
{
    int n = 2, i = 0, j = 0, count = 0;
    while (count <= (n * 2))
    {

        func2(i);
        printf("\n");
        count = count + 1;
        if (count <= n)
        {
            i = func1(i);
        }
        else
        {
            i = func3(i);
        }
        /* code */
    }
}