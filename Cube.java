import java.util.*;
public class Cube {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Cube : "+cube(n));
    }
    public static int cube(int n){
        return n*n*n;
    }
}
