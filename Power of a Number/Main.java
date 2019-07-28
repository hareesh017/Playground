#include <stdio.h>
int main()
{
  	int a=1,exp,bas,i;
  scanf("%d%d",&bas,&exp);
  if(exp>=0)
  {
  for(i=1;i<=exp;i++)
  {
    a=a*bas;
  }
  printf("%d",a);
  }
  else
  {
    printf("Wrong input");
  }
    return 0;
}