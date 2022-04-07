import java.util.*;
public class Ques10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        n_numbers(n,m);
    }

    public static void n_numbers(int n, int m){
        int i=1;
        while(n--!=0){
            System.out.println(m*i);
            i++;
        }
    }
}
