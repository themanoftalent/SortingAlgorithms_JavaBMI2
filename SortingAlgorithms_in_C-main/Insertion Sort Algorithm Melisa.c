//Insertion Sort Algorithm

#include <stdio.h>

int main(){
    int i,j,n,temp;
    int array[100];
    printf("Enter number of elements:");
    scanf("%d",&n);
    printf("Enter %d integers:",n);
    for(i=0;i<n;i++){
        scanf("%d",&array[i]);
    }
    for(i=1;i<=n-1;i++){
        j=i;
        while(j>0 && array[j-1]>array[j]){
            temp=array[j];
            array[j]=array[j-1];
            array[j-1]=temp;
            j--;
        }
    }
    printf("Sorted list in ascending order:\n");
    for(i=0;i<=n-1;i++){
        printf("%d ",array[i]); 
    }
    return 0;
}
