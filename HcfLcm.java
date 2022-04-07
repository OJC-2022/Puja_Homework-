import java.util.*;
public class HcfLcm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int lcm=(n1*n2)/gcd(n1,n2);
        System.out.println("GCD: "+gcd(n1,n2));
        System.out.println("LCM: "+lcm);
    }

    public static int gcd(int n1, int n2){
        if(n1>n2){
            n1=n2;
            n2=n1;
        }
        while(n1!=0){
            int r=n2%n1;
            n2=n1;
            n1=r;
        }
        return n2;
    }
}