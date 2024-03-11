#include "stdlib.h"
#include "stdio.h"

int main() {
    int numbers[11],i,j,a; 
  	int dizi[11] = {96,85,1,2,34,5,45,74,25,12,6};
 }
  	for(i=0; i<11; i++) { 
 		for(j=0; j<11; j++) { 
    		if(numbers[i]<numbers[j]) { 
 
 		a = numbers[i]; 
 		numbers[i] = numbers[j]; 
 		numbers[j] = a; 
 }}}
  	for(i=0; i<11; i++) {
 		printf("%d ",numbers[i]);
 }
	
    
    return 0;
}
