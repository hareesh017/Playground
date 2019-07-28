#include<stdio.h>
int main()
{
  int a,b,c,sum;
  scanf("%d",&a);
  c=a%10;
  b=a/100;
  sum=c+b;
  printf("%d",sum);
  return 0;
}