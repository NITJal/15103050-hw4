import java.lang.*;
import java.util.*;

public class MainTraffic {
public static void main(String args[])
{
    Runnable lights=new Lights();

    Thread one=new Thread(lights);
    Thread two=new Thread(lights);
    Thread three=new Thread(lights);
    Thread four=new Thread(lights);

    one.setName("green");
    two.setName("yellow");
    three.setName("flashingyellow");
    four.setName("red");

    one.start();
    two.start();
    three.start();
    four.start();


}
}

class Lights implements Runnable {

    int a=0,i;


    public void showLight()
    {
        System.out.println("The Light is "+ Thread.currentThread().getName());
    }

    public void run() {
        a=0;
            for(i=25;i>=0;i--)
            {
                while(a==0)
                {
                showLight();

                try {

                    Thread.sleep(1000);


                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
                a++;
                }


            while(a==1)
            {
                showLight();

                try {

                    Thread.sleep(500);


                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
                a++;
                }


            while(a==2)
            {
                showLight();

                try {

                    Thread.sleep(500);


                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
                a++;
                }
            while(a==3)
            {
                showLight();

                try {

                    Thread.sleep(1000);


                } catch (InterruptedException e) {

                    e.printStackTrace();
                }

            }

            }
}
}
