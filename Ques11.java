import java.util.*;
public class Ques11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum_1ton(n));
    }

    public static int sum_1ton(int n){
        return ((n*(n+1))/2);
    }
}
