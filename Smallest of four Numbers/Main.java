#include<stdio.h>

int main()
{
 int a,s,d,f;
  scanf("%d%d%d%d",&a,&s,&d,&f);
  if(a<s&&a<d&&a<f)
  {
    printf("%d",a);
  }
  else if(s<a&&s<d&&s<f)
  {
    printf("%d",s);
  }
  else if(d<a&&d<s&&d<f)
  {
    printf("%d",d);
  }
  else
  {
    printf("%d",f);
  }
  
}