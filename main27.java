class myThread extends Thread
{public void run()
{System.out.println("Thread a is running");
}
}

class b extends Thread
{public void run()
{System.out.println("Thread b is running");
}
}
class main27
{public static void main(String args[])
{myThread t1=new myThread();
b t2=new b();
t1.start();
t2.start();
}}