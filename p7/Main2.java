public class Main2 implements Runnable{
    
    public static void main(String[] args) {
        Main Obj = new Main();
        Thread thread = new Thread(Obj);
        thread.start();
        System.out.println("This code is outside of the thread");

    }
    public void run()
    {
        System.out.println("This code is running in a thread");

    }

}
