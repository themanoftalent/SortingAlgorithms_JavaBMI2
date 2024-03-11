#include <stdio.h>

int main()
{
    int i,j,k;
    printf("Satir sayisini giriniz:");
    scanf("%d",&k);
    
    for(i=k;i>=1;i--){
        for(j=1;j<=i;j++){
            printf("%d",j);
            
        }
        printf("\n");
    }

    return 0;
}
