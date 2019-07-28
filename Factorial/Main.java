#include<stdio.h>
int main()
{
	long int n,fact=1;
  scanf("%ld",&n);
  for(int c=1;c<=n;c++)
  {
    fact=fact*c;
  }
  printf("%ld",fact);
  //your code here
}