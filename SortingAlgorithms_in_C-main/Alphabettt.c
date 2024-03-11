#include"stdio.h"
 int main(){
 	int i,j,k;
 	char alphabet='A',n;
 	printf("En son hangi Harf olsun? ");
 	scanf("%c",&n);
 	
 	for(i=0;i<=(n-'A');i++){
 		for(j=0;j<=i;j++){
 			printf("%c",alphabet);
		 }
 		printf("\n");
 		alphabet++;
	 }
	 return 0;
 }
