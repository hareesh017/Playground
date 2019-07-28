#include<stdio.h>
int main()
{
  int n1,n2,n,i,l,j;
  scanf("%d%d",&n1,&n2);
  n=n1>n2?n2:n1;
  for(i=n;i>=1;i--)
  {
    if(n1%i==0&&n2%i==0)
    {
      j=i;
      break;
    }
  }
  l=n1*n2/j;
  printf("%d",l);
  
  return 0;
}