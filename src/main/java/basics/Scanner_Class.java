package basics;

import java.util.Scanner;

public class Scanner_Class
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Print your age: ");
        int age = s1.nextInt();
        System.out.println("Your age is : "+ age);
        System.out.println("now type your name : ");
        String name = s1.next();
        System.out.println("Your name is :" + name);

    }
}
