package spb.herzen;

/**
 * Created by pdr on 3/24/16.
 */
public class SecondThreed extends Thread {
    public void run(){

        Thread thirdThreed = new ThirdThreed();
        thirdThreed.start();
        for (int i = 0; i <=20 ; i++) {
            System.out.println("Hello from SecondThread"+i);
           try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (thirdThreed.isAlive()==false){
                break;
            }
        }

    }

}
