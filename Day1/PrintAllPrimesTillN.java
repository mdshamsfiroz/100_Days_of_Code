import java.util.*;

public class PrintAllPrimesTillN{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low=scn.nextInt();
        int high=scn.nextInt();
        for(int n=low;n<=high;n++){
            boolean flag=true;
            for(int div =2;div*div<=n;div++){
                int rem = n%div;
                if(rem == 0){
                    flag = false;
                    break;
                }
           
            }
             if(flag==true){
                System.out.println(n);
            }
        }
    }
}