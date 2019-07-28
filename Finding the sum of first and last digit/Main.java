#include <stdio.h>
int main() {
	int a,b,c;
  scanf("%d",&a);
  b=a;
  while(b >=10 )
  {
    b=b/10;
    
  }
  c=a%10;
  printf("%d",b+c);
  
  
  //Type your code
	return 0;
}