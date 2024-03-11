#include <stdio.h>

int main()
{
    int i,j,k,n;
    
    printf("Enter number of rows");
    scanf("%d",&k);
    
    printf("Enter number of columns:");
    scanf("%d",&n);
    
    for(i=1;i<=k;i++){
        for(j=1; j<=n; j++){
            if(i==1 || i==k || j==1 || j==n)
            printf("*");
            else{
                printf(" ");
            }
        }
        printf("\n");
    }

    return 0;
}
