#include <stdio.h>
int main() {
  int n,sum=0,d=0;
  scanf("%d",&n);
  while(n>0)
  {
    d=n%10;
    sum=sum+d;
    n=n/10;
  }
  printf("%d",sum);
  
	//Type your code
	return 0;
}