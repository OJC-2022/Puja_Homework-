import java.util.*;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
public class Divisibleby6 {

    public static boolean[] checkdivisibility(int[] arr){
        boolean[] newArr = new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%6==0){
                newArr[i]=true;
            }
            else{
                newArr[i]=false;
            }
        }
        return newArr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean b[] = checkdivisibility(arr);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
