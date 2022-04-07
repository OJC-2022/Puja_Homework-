import java.util.*;
public class Divisibleby7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isdivisibleby7(n))
           System.out.println("divisible by 7");
        else
           System.out.println("not divisible by 7");
    }

    public static boolean isdivisibleby7(int n){
        if(n%7==0)
           return true;
        else
           return false;
    }
}
