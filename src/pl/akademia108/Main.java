package pl.akademia108;

import pl.akademia108.PrintMessage;
import pl.akademia108.GenerateRandom;

public class Main {

    public static void main(String[] args) {

        GenerateRandom random = new GenerateRandom(0, 10, 8);
        PrintMessage message = new PrintMessage();

        Thread t1 = new Thread(random);
        Thread t2 = new Thread(message);

t1.start();
t2.start();
    }
}
