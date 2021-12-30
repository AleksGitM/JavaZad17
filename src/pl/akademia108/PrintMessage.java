package pl.akademia108;

public class PrintMessage implements Runnable {
    private int timeout = 0;
@Override
    public void run(){
        while (timeout <= 9) {
            try {
                System.out.println("Jestem drugim wątkiem");
                Thread.sleep(10000);
                timeout++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}