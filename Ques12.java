import java.util.*;
public class Ques12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        odd_bet_2no(n, m);
    }

    public static void odd_bet_2no(int n, int m){
        for(int i=n;i<=m;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
