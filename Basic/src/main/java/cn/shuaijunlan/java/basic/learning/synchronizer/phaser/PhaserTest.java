package cn.shuaijunlan.java.basic.learning.synchronizer.phaser;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.Phaser;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 2:26 PM 11/7/18.
 */
public class PhaserTest {
    public static void main(String[] args)
            throws InterruptedException {
        final Phaser phaser = new Phaser(1);
        for (int index = 1; index <= 10; index++){
            phaser.register();
            new Thread(
                    new Player(phaser),
                    "Player" + index).start();
        }
        System.out.println("Game start");
        phaser.arriveAndDeregister();

        while (!phaser.isTerminated()){
            Thread.sleep(100);
        }
        System.out.println("Game over");
    }
    @Test
    public void test1() throws InterruptedException {
        final Phaser phaser = new Phaser(0); // default zero
        for (int index = 1; index <= 10; index++){
            if (index == 1){
                Thread.sleep(1000);
            }
            // Thread.sleep(1000);
            System.out.println(phaser.getRegisteredParties() + ":" + phaser.isTerminated());
            phaser.register();
            System.out.println(phaser.getRegisteredParties() + ":" + phaser.isTerminated());
            new Thread(
                    new Player(phaser),
                    "Player" + index).start();
        }
        System.out.println("Game start");
        // phaser.arriveAndDeregister();

        while (!phaser.isTerminated()){
            Thread.sleep(100);
        }
        System.out.println("Game over");
    }

    @Test
    public void test2() throws InterruptedException {
        Phaser phaser = new Phaser();
        System.out.println(phaser.isTerminated());
        phaser.forceTermination();
        System.out.println(phaser.isTerminated());
        phaser.register();
        System.out.println(phaser.isTerminated() + ":" + phaser.getRegisteredParties());
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    System.out.println("finishing task!");
                    phaser.arriveAndDeregister();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        while (!phaser.isTerminated()){
            Thread.sleep(100);
        }
    }
}
class Player implements Runnable{
    private final Phaser phaser;
    Player(Phaser phaser){
        this.phaser = phaser;
    }
    @Override
    public void run() {
        //First step, waiting for all threads be created
        phaser.arriveAndAwaitAdvance();

        try {
            //Second step, waiting for all players be ready
            Thread.sleep(
                    new Random().nextInt(100) * 10L);
            System.out.println(
                    Thread.currentThread().getName() + " ready");
            phaser.arriveAndAwaitAdvance();

            /////////////////running////////////////////

            //Third step, waiting for all players arrived, then competition finishing.
            System.out.println(
                    Thread.currentThread().getName() + " arrived");
            phaser.arriveAndDeregister();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}