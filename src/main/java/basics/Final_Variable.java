package basics;

public class Final_Variable
{
    static int b = 30;
    public static void main(String[] args) {
        final int a =20;
       // a = 30; can not assign value to final variable
        System.out.println(a);
        b = 50;
        System.out.println(b);
    }
}
