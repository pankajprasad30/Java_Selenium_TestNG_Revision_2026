package basics;

public class Global_Default_Values
{
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    boolean g;
    String h;
    char i;
    void call_all()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Global_Default_Values a1= new Global_Default_Values();
        a1.call_all();

    }

}
