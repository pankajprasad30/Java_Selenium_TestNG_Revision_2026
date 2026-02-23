package basics;
// Developing multiple constructor but variation in argument list.
public class Constructor_Overloading
{
    Constructor_Overloading()
    {
        System.out.println("Output from 1st method");

    }
    Constructor_Overloading(int a)
    {
        //int b = 10;
        System.out.println(a);

    }

    public static void main(String[] args)
    {
        new Constructor_Overloading();
        new Constructor_Overloading(30);

    }

}
