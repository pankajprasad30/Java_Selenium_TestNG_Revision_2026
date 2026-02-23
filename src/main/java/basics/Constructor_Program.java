package basics;

public class Constructor_Program
{
    Constructor_Program()
    {
        System.out.println("Output from Constructor method");
    }

    public static void main(String[] args)
    {
        Constructor_Program a1 = new Constructor_Program(); // 1st method to call
        new Constructor_Program();// 2nd method to call


    }
}
