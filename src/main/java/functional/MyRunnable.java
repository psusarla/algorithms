package functional;

public class MyRunnable {
    public static void main (String args[]) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("do something");
            }
        };
        r.run();


        r = () -> System.out.println("Do some other thing");
        r.run();
    }
}
