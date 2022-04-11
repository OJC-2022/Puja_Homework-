public class Hello {
    int a=10;
    static int b=20;

    public static void main(String[] args){
        Hello h1 = new Hello();
        Hello h2 = new Hello();
        System.out.println(h1.a);
        System.out.println(h2.a);
        System.out.println(b);
        System.out.println(h1.b);
        System.out.println(h2.b);
        h1.a=89;
        System.out.println(h1.a);
        System.out.println(h2.a);
        h2.b=56;
        System.out.println(h1.b);
        System.out.println(h2.b);
    }
}
