#include <stdio.h>

int main() {
    int i,j,k;
    scanf("%d",&k);
    
    for(i=0;i<k;i++){
        if(i!=0 && i!=(k-1)){
        for(j=0;j<k;j++){
            if(j!=0 && j!=(k-1)){
                printf(" \t");
            }
            else{
            printf("*\t");
            }
        }
        printf("\n");
        }
        else{
            for(j=0;j<k;j++){
                printf("*\t");
            }
            printf("\n");
        }
        
    }

    return 0;
}
