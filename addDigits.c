#include <stdio.h>
int sum(int num){
	int sum=0;
        while(num>0){
                sum+=num%10;
                num/=10;
            }
        
        return sum;
}
 int addDigits(int num){
	 while(num>9){
            num=sum(num);
        }
        
        return num;	
}
int main(){
	int number;
	
	printf("Enter a number :");
	scanf("%d",&number);
	
    printf("%d",addDigits(number));
    }

