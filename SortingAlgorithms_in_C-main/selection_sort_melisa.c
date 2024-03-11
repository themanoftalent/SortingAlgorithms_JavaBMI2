
#include <stdio.h>

 int main(){
         int array[11] = {96,85,1,2,34,5,45,74,25,12,6};
         int i,j;
         for(i=0; i<11; i++){
              int min = i;
              for(j=i+1; j<11; j++){
                if(array[j] < array[min]){
                     min = j;
                }
              }
              int temp = array[i];
              array[i] = array[min];
              array[min] = temp;
         }
         for(i=0; i<11; i++){
              printf("%d ", array[i]);
         }
         return 0;
    }
    
    
