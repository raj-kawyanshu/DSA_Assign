import java.util.Scanner;

public class Throw {
    static void checkage(int age)
    {
        if(  age<18)
        {
            throw new ArithmeticException("Access denied -- You Must be atleat 18 year old. ");

        }
        else
        {
            System.out.println("Access Granted - you are old Enought. ");
        }
    }
    public static void main(String[] agrs)
        {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter the your age: ");
            int age = myScanner.nextInt();
            checkage(age);
        }
}





// The throw statement allows you to create a custom error.

