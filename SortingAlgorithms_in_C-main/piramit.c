#include <stdio.h>

int main()
{
    int i,j,k;
    printf("Satir sayisini giriniz:");
    scanf("%d",&k);
    
    for(i=0;i<=k;i++){
        for(j=1;j<=i;j++){
            printf("+");
            
        }
        printf("\n");
    }

    return 0;
}

