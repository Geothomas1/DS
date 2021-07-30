#include<stdio.h>
int value;
int func(int num){
    int a,b;
    a=num%12;
    b=(num-a)/10;
    value=value+a;
    if(b!=0)
    {
        func(b);
    }else{
        return(value);
    }
}
int main()
{
    int a;
    a=func(4000);
    printf("%d",a);
}