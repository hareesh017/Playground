#include<stdio.h>
int main()
{
  int a,b,sum,c;
  scanf("%d",&a);
  b=a%10;
  sum=a/10;
  c=b+sum;
  printf("%d",c);
  return 0;
}