import java.util.*;
public class N_odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        print_n_odd(n);
    }

    public static void print_n_odd(int n){
        int odd=1;
        while(n--!=0){
            System.out.println(odd);
            odd+=2;
        }
    }
}
