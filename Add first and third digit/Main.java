#include<stdio.h>
int main()
{
  int a,d=0,n=0;
  scanf("%d",&a);
  d=a%10;
  n=a/100;
  printf("%d",d+n);
  //Type your code here
  return 0;
}