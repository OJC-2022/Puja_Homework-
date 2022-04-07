import java.util.*;
public class Evenfromn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        even_nto2(n);
    }

    public static void even_nto2(int n){
        if(n%2!=0){
            n=n-1;
        }
        while(n!=0){
            System.out.println(n);
            n-=2;
        }
    }
}
