public class Exceptions {

    public static void main(String[] args) {
        try{
            int[] mynumbers = {1,2,3};
            System.out.println(mynumbers[10]);
        }
        catch (Exception e)
        {
            System.out.println("Index is out of range");
        }
        finally
        {
            System.out.println("Finally must get exicuted");
        }
    }
}



// If an error occurs, we can use try...catch to catch the error and execute some code to handle it:
// The finally statement lets you execute code, after try...catch, regardless of the result:

