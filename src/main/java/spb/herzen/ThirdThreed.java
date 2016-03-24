package spb.herzen;

import java.util.Random;

/**
 * Created by pdr on 3/24/16.
 */
public class ThirdThreed extends Thread {
    int rnd;
    boolean bol;

    public void run() {
        System.out.println("Start ThrirdThread");
        rnd = (int) ((Math.random() * 1000000) + 100000);
        for (int i = 2; i <= Math.sqrt(rnd); i++) {
            if (rnd % i == 0) {
                bol = false;
            }
        }
        if (bol == false) {
            System.out.println(rnd + ": Is not simple");
        } else {
            System.out.println(rnd + ": Is simple number!Congratulations!");
        }
    }
}
