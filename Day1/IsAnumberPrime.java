import java.util.Scanner;
public class IsAnumberPrime {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int num=scn.nextInt();

        int flag =1;
        for(int i=2;i*i<=num;i++){
            if(num%i ==0){
                flag =0;
                break;
         }
        }
        if(flag==1){
            System.out.println("prime");
        }
        
        else {
            System.out.println("not prime");
        }
    }
}

 