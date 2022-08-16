package airport;

public class ControlTower {

    public static void main(String[] args) {
        Runnable plane1 = new Plane();
        Runnable plane2 = new Plane();
        Runnable plane3 = new Plane();
        Runnable plane4 = new Plane();
        Runnable plane5 = new Plane();
        Runnable plane6 = new Plane();

        Thread th1 = new Thread(plane1);
        Thread th2 = new Thread(plane2);
        Thread th3 = new Thread(plane3);
        Thread th4 = new Thread(plane4);
        Thread th5 = new Thread(plane5);
        Thread th6 = new Thread(plane6);

        System.out.println("Air port is opened");
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();

        try {
            th1.join();
            th2.join();
            th3.join();
            th4.join();
            th5.join();
            th6.join();

            th3.interrupt();

            ((Plane)plane1).stopPlane();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
            //close db connection
            //close network connection (socket)

        }

        System.out.println("Air port is closed");

    }
}
