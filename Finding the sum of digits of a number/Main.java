#include <stdio.h>
int main() {
	int a,sum=0,t,b;
  scanf("%d",&a);
  t=a;
 while(t != 0)
 {
   b= t % 10;
   sum=sum + b;
   t=t/10;
   
 }
  printf("%d",sum);
  
	return 0;
}