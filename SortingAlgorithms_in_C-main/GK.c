#include <stdio.h>
int main()
{
  int i,j,k;

  printf("Satir sayisini girin:");
  scanf("%d", &i);

  for (j = 1; j <= i; j++)
  {
    for (k = 1; k <= i-j; k++)
      printf(" ");

    for (k = 1; k < j; k++)
      printf("*GK");

    printf("*\n");
  }
  return 0;
}
