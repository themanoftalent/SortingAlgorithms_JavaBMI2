#include "stdlib.h"
#include "stdio.h"

int main() {
    int i,j,temp;
    int dizi[11] = {96,85,1,2,34,5,45,74,25,12,6};
    
    for(i=0; i<11; i++) {
        for(j=0; j<11; j++) {
            if(dizi[i] < dizi[j]) {
                temp = dizi[i];
                dizi[i] = dizi[j];
                dizi[j] = temp;
            }
        }
    }
    
    for(i=0; i<11; i++) {
        printf("%d ",dizi[i]);
    }
    
    return 0;
}
