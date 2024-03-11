 #include <stdio.h>
 
 int main(){
        int array[11] = {96,85,1,2,34,5,45,74,25,12,6};
        int i,j;
        for(i=1; i<11; i++){
            for(j=i; j>0; j--){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        for(i=0; i<11; i++){
            printf("%d ", array[i]);
        }
        return 0;
    }
