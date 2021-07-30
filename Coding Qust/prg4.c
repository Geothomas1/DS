#include<stdio.h>
void func(int a){
    if(a>0){
        func(--a);
        func(a--);
        func(a++);
        printf("%d",a);
    }
}
int main(){
    func(3);
}