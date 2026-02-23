package basics;
// We can call non-static method by creating an object with the help of reference variable.
public class Non_Static_Method
{
    void add()
    {
        int a=10,b=20;
        int add=a+b;
        System.out.println(add);
    }

    public static void main(String[] args)
    {
        Non_Static_Method a1 = new Non_Static_Method();
        a1.add();

    }


}
