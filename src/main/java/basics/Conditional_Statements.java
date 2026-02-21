package basics;

public class Conditional_Statements
{
    // Conditional Statements  [>,<,>=,<=,!=,==] (21/02/2026)
    /*   if
         if else
         if else if
         nested if
    */
    // This program checks a user's age and membership status to determine their movie ticket price.

    public static void main(String[] args)
    {
        int age = 18;
        String member = "female";  // Put in quotes

        if (age >= 18)
        {
            if (member.equals("female"))
            {
                System.out.println("Price is 20 Rs");
            } else
            {
                System.out.println("Price is 100 Rs");
            }
        }
        else
        {
            System.out.println("Not Allowed");
        }

    }

}

