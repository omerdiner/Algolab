import java.util.Scanner;

public class HarunAndSami {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int K= scan.nextInt();
        String s=scan.next();

        int h_count=0;
        int s_count=0;

        for(int i=0;i<K;i++){
            if(s.charAt(i)=='S'){
                s_count++;
            }else{
                h_count++;
            }
        }

        if(h_count>N/2){
            System.out.println("Harun");
        }else if(s_count>N/2){
            System.out.println("Sami");
        }else{
            System.out.println("Cilek");
        }
    }
}
