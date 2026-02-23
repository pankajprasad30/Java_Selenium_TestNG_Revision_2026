package basics;

public class Global_Variable
{
    static int a = 40;
    int b= 50;
    static int c;

    void add()
    {
        System.out.println(b);
    }

    public static void main(String[] args) {
        System.out.println(a);
        Global_Variable a1= new Global_Variable();
        a1.add();
        System.out.println(c);

    }
}
