#include <stdio.h>
int main() {
  int n,c=0;
  scanf("%d",&n);
  c=((2*n)-1);
  for(int i=1;i<=n;i++)
  {
    if(i%2==1)
   printf("%d\n",i);
  }
    
	//Type your code
	return 0;
}