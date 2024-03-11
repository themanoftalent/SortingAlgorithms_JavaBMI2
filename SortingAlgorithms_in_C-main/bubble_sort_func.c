 void swap(int *a, int *b) {
     int temp = *a;
     *a = *b;
     *b = temp;
 }
 
 int main(){
        int array[11] = {96,85,1,2,34,5,45,74,25,12,6};
        int i,j;
        for(i=0; i<11; i++){
            for(j=0; j<11; j++){
                if(array[i] < array[j]){
                    swap(&array[i], &array[j]);
                }
            }
        }
        for(i=0; i<11; i++){
            printf("%d ", array[i]);
        }
        return 0;
    }
     
