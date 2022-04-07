public class MyClass {
    public static void main(String[] args){
        MyClass c = new MyClass();
        int ans = minimum1(9, 7);
        int res = minimum1(45,67);
        System.out.println(ans);
        System.out.println(res);

    }

    public int minimum(int x, int y){
        if(x<y)
          return x;
        else
          return y;
    }

    public static int minimum1(int x, int y){
        if(x<y)
          return x;
        else
          return y;
    }
}
