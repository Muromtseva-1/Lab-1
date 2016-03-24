package spb.herzen;

public class FirstThreed extends Thread{
 int sum ;
    public void run(){
        for (int i = 0; i <= 100; i++)
        { this.sum+=i;
        }
        System.out.println(sum);
    }

}
