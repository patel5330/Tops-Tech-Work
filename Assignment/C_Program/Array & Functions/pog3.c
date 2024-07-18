//4. WAP to find factorial using recursion
#include<stdio.h>
 void Reversestring(char*str){
     if(*str){
          reversesteing(str+1);
          print("%c",*str);
     }
     int main()
     {
          char str[100];
          print("enter a string:");
          scanf("reversed string:");
          Reversestring(str);
          return 0;
     }
 }