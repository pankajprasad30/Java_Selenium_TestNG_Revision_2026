package basics;

public class Method_Overloading
{
    void add()
    {
        System.out.println("Output from 1st method");
    }
    void add(String name)
    {
        System.out.println("Output from 2st method :" + name );
    }
    static void add(int q)
    {
        System.out.println("Output from 3rd method: "+ q);
    }

    public static void main(String[] args)
    {
        Method_Overloading a1 = new Method_Overloading();
        a1.add();
        a1.add("Pankaj");
        add(30);


    }
}
