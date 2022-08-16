package airport;

public class Plane implements Runnable{

    private boolean stopMe=false;
    @Override
    public void run() {
        System.out.println("Plane is in the air");
        try {
            while (!stopMe) {
                takeOff();
                fly();
                synchronized (Plane.class) {
                    land();
                }
            }
            Thread.sleep(1013);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void stopPlane(){
        stopMe=true;
    }

     private void land() throws InterruptedException {
        Thread.sleep(1093);
    }

    private void fly() throws InterruptedException {
        Thread.sleep(1033);
    }

    synchronized private void takeOff() throws InterruptedException {
        Thread.sleep(666);
    }
}
