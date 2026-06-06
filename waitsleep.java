class MyThread extends Thread
{public void run()
{try
{for(int i=1;i<5;i++)
{System.out.println("count is"+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e){System.out.println(e);
}
}
}
class waitsleep
{   public static void main(String args[])
{MyThread t=new MyThread();
t.start();
try
{
Thread.sleep(2000);
System.out.println("suspending thread");
t.suspend();
Thread.sleep(3000);
System.out.println("resuming thread");
t.resume();
}
catch(InterruptedException e){System.out.println(e);
}
}
}