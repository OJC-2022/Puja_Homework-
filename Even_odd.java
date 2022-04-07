import java.util.*;
public class Even_odd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkEvenOdd(n);
    }

    public static void checkEvenOdd(int n){
        if(n%2==0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
}