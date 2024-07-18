#include<stdio.h>
int main(){
     int  ch x,y,z;
     print("enter teow number");
     scanf("%d%d",&x,&y);
     printf("/n1:add\n2:sub\n3:mul\n4:div\n5:mod\n");
     scanf("%d",&ch);
     switch(ch){
          case 1:
          z=x+y;
          print("addition=%d\n",z);
          break;
            case 2:
            z=x-y;
            print("sabtraction=%d",z);
            break;
            case 3:
            z=x*y;
            print("multiplication=%d",z);
            break;
            case 4:
            z=x/y;
            print("divisio%d",z);
            break;
            case 5:
            print(",modulus=%d",z);
            break;
     }
     return 0;
}