package basics;

public class Mix_Method_Order_Execution
{
    static
    {
        System.out.println("Output from SIB method");
    }
    {
        System.out.println("Output from IIB method");
    }
    static void add()
    {
        System.out.println("Output from static method");
    }
    void sub()
    {
        System.out.println("Output from non-static method");
    }

    public static void main(String[] args) {
        add();
        Mix_Method_Order_Execution a1 = new Mix_Method_Order_Execution();
       // add();
        a1.sub();

    }

}
