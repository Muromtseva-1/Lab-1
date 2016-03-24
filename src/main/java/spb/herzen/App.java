package spb.herzen;

public class App {
    public static void main(String[] args) {
        //Задание №1
        System.out.println("<-------Exercise_#1------->");
        Thread FirstThreed = new FirstThreed();
        FirstThreed.start();
        try {
            FirstThreed.join();
            FirstThreed.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Задание №2
        System.out.println("<-------Exercise_#2------->");
        // Thread thirdThreed = new ThirdThreed();
        Thread secondThreed = new SecondThreed();


        secondThreed.start();


    }
}

