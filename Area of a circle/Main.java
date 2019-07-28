#include<stdio.h>
int main()
{
  int dia;
  scanf("%d",&dia);
  float r,a;
  r=(float)dia/2;
  a=3.14*r*r;
  printf("%.2f",a);
  
  return 0;
}