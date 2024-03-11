
 #include <stdio.h>
  // put in order 96 85 1 2 34 5 45 74 25 12 6
 int main() {
 
 	int sayilar[11],i,j,gecici; 
 	for(i=0; i<11; i++) { 
 		printf("Sayi giriniz:"); 
 		scanf("%d",&sayilar[i]);
 	}
 	for(i=0; i <11; i++) { 
 		for(j=0; j<11; j++) {
 			if(sayilar[i]<sayilar[j]) { 
 				gecici = sayilar[i]; 
 				sayilar[i] = sayilar[j]; 
 				sayilar[j] = gecici; 
 			}
 		}
 	}
 	for(i=0; i<5; i++) {
 		printf("%d ",sayilar[i]);
 	}
 	return 0;
 }