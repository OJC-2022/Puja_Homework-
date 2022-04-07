import java.util.*;
public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(isPrime(n))
           System.out.println("prime");
        else
           System.out.println("not prime");
    
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        else if(n==2 || n==3){
            return true;
        }
        else {
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
    }
        return true;
    
}
}
