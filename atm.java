public class ATM
{
    public static void main(String args[])
    {
    final func c=new func();
    new Thread()
    {
    public void run(){c.withdraw(15000);}
    }.start();
    new Thread()
    {
    public void run(){c.deposit(10000);}
    }.start();

    }
}

class func{
  int amount=10000;

    synchronized void withdraw(int amount)
    {
    System.out.println("Bob is trying to withdraw");

    if(this.amount<amount)
    {
    System.out.println("Balance Insufficient. Waiting for deposit");
    try{
    wait();
    }
    catch(Exception e){}
    }
    this.amount=this.amount-amount;

    System.out.println("Bob's withdrawal completed");
    }

    synchronized void deposit(int amount)
    {
    this.amount=this.amount+amount;
    System.out.println("Alice has deposited the amount ");
    notify();
    }
}
