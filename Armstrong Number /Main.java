#include <stdio.h>
int main() {
  int number, originalNumber, remainder, result = 0, n = 0 ;

   
    scanf("%d", &number);

     originalNumber = number;
    
    while (originalNumber != 0)
    {
        originalNumber /= 10;
        ++n;
    }

    originalNumber = number;

    while (originalNumber != 0)
    {
        remainder = originalNumber%10;
        result += pow(remainder, n);
        originalNumber /= 10;
    }

    if(result == number)
        printf("Armstrong Number", number);
    else
        printf("Not an Armstrong Number", number);
	//Type your code
	return 0;
}