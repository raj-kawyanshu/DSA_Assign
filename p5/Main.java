import java.util.Scanner;

public class Main {

    // The Scanner class is used to get user input, and it is found in the java.util package.
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String userName;
        
        System.out.println("Enter the Username:");
        userName = myObj.nextLine();  // Read user input
        int x = myObj.nextShort();
        System.out.println(x);
        System.out.println("UserName is " + userName);  // Output user input
        
        myObj.close();  // Close the Scanner to prevent resource leaks
    }
}
