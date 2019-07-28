#include <stdio.h>
int main() {
	 int num,i,f,r,sum=0,num1;

 scanf("%d",&num);

 num1=num;
 while(num){
  i=1,f=1;
  r=num%10;

  while(i<=r){
   f=f*i;
   i++;
  }
  sum=sum+f;
  num=num/10;

 }
 if(sum==num1)
  printf("Yes");
 else
  printf("No");
	return 0;
}