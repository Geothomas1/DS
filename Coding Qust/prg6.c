#include<stdio.h>
int main(){
    int z=2,k=1;
    for(;;){
        if(z==3)
        break;
        else
        k+=z;
        printf("%d",k);
        z+=k;
    }
}