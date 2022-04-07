import java.util.*;
public class Rectangle_area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        System.out.println("Area : "+area(length, breadth));
    }

    public static double area(double l, double b){
        return l*b;
    }
}
