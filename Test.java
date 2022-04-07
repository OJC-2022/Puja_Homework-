import java.util.*;
public class Test {
    int noOfQues=10;
    char[] options = {'A','B','C','D'};
    public static void main(String[] args){
        /*for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        for(int j=0;j<4;j++){
            System.out.println(options[j]);
        }*/
        Test t = new Test();
        print1to10();
        t.printoptions();
    }

    public static void print1to10(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
    public void printoptions(){
        for(int j=0;j<4;j++){
            System.out.println(options[j]);
        }
    }
}
