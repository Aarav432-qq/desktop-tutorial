class myThread extends Thread
{public void run()
{for(int i=1;i<=5;i++)
{System.out.println("child thread is running"+i);
}
}
}
class main26
{public static void main(String args[])
{myThread t=new myThread();
t.start();
for(int i=1;i<=5;i++)
{System.out.println("main thread is running"+i);
}
}
}