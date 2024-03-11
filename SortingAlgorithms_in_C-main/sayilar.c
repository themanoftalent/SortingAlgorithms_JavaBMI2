#include"stdio.h"
 int main(){
 	int i,j,n,k;
 	printf("Kac satir olsun? ");
 	scanf("%d",&n);
 	
 	for(i=1;i<=n;i++){
 		for(j=1;j<=i;j++){
 			printf("%d",j);
		 }
 		printf("\n");
	 }
 	
 	for(i=n;i>=1;i--){
 		for(j=1;j<=i-1;j++){
 			printf("%d",j);
		 }
 		printf("\n");
	 }
	 return 0;
 }
