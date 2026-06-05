class myThread extends Thread
{public void run()
{System.out.println("running thread is"+Thread.currentThread().getName());
}
}
class main28
{public static void main(String args[])
{myThread t1=new myThread();
myThread t2=new myThread();
t1.setName("Thread A");
t2.setName("Thread B");
t1.start();
t2.start();
}

}