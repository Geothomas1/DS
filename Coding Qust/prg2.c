#include<stdio.h>
int main()
{
    static int var[10];
    int count=0;
    var[++count]=++count;
    for(count=0;count<9;count++){
        printf("%d",var[count]);
    }
    return 0;
}