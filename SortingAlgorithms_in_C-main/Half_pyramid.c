#include<stdio.h>

int main(){
    int number_of_rows, i, j;
    printf("Input number of rows: ");
    scanf("%d", &number_of_rows);


    for(i=0; i<=number_of_rows; i++){
        for(j=0; j<=i; j++){
                    printf("*");

        }
        printf("\n");
    }
}
