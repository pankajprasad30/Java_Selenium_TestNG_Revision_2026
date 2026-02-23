package basics;
// Static method can be called by its method name.
public class Static_Method
{
    static void Pankaj()
    {
        System.out.println("Pankaj");
    }

    public static void main(String[] args)
    {
        System.out.println("Main Method: ");
        Pankaj();
        Prasad();

    }
    static void Prasad()
    {
        System.out.println("Prasad");
    }
}
