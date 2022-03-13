#include <stdio.h>
int sumOddLengthSubarrays(int arr[],int size) {
	
        int sum=0;
        int i,j;
    
        for( i=0;i<size;i++){
            int x=1;
            int tmp=0;
            for(j=i;j<size;j++){
                tmp+=arr[j];
                if(x%2==1){
                    sum+=tmp;
                }
                x++;
                
            }
        }
        return sum;
}

int main(){
	
	int arr_size,i;
	int* arr;    
	
    printf("Kac elemanli bir dizi gireceksiniz:");
    scanf("%d",&arr_size);
    
       arr = calloc(arr_size, sizeof(int) );  
    
       for ( i = 0; i < arr_size; i++ ){
       	   printf("%d. element:",i+1);
       	   scanf("%d",&arr[i]);
	   }
   	             
	
	printf("%d",sumOddLengthSubarrays(arr,arr_size));
	
	free(arr); 
}

