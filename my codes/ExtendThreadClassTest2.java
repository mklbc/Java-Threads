public class ExtendThreadClassTest2 {

    public static void main(String args[]) {
        System.out.println("Creating PrintNameThread objects and starting threads..");

        PrintNameThread pnt1 = new PrintNameThread("A");
        PrintNameThread pnt2 = new PrintNameThread("B");
        PrintNameThread pnt3 = new PrintNameThread("C");

        // Create and start another thread with the name "MyOwn"
        System.out.println("Creating and starting MyOwn thread..");
        PrintNameThread myOwnThread = new PrintNameThread("MyOwn");
    }
}
