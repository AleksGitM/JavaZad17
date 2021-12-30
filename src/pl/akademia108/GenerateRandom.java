package pl.akademia108;

import java.util.Random;

public class GenerateRandom implements Runnable {
    private Integer random_int;
    private Integer min;
    private Integer max;
    private Integer breakNumber;

    public GenerateRandom(Integer min, Integer max, Integer breakNumber) {
        this.min = min;
        this.max = max;
        this.breakNumber = breakNumber;
    }
@Override
    public void run() {
        while (this.random_int != this.breakNumber) {
            try {
                this.random_int = (int) Math.floor(Math.random() * (this.max - this.min + 1) + this.min);
                System.out.println(random_int);
                Thread.sleep(5000);
        } catch (InterruptedException e) {
        e.printStackTrace();
    }
        }
    }
}