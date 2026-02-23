package basics;
// local variable scope is only till inside of method
public class Local_Variable
{
    static void add()
    {
       // System.out.println(a);
    }
    public static void main(String[] args)
    {
        int a = 10;
        System.out.println(a);
        add();
    }
}
