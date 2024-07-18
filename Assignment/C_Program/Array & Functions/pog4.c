//4. WAP to find factorial using recursion
#include<stdio.h>
long int factorial(int n){
     if(n>=1)
     return n* factorial(n-1);
else 
return 1;
}
int main(){
     int num;
     printf("enter a positive integer");
     scanf("%d",&num);
     printf(" factorial of %d",num,factorial(num));
     return 0;
}
