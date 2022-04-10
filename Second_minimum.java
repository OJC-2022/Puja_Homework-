import java.util.*;
public class Second_minimum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("second smallest element : "+secondMin(arr));
    }
    public static int secondMin(int[] arr){
        int min1 = arr[0];
        int min2 = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }
            else if(arr[i]<min2){
                min2=arr[i];
            }
        }
        return min2;
    }
}
