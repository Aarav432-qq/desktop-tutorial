class even implements Runnable
{public void run()
{for(int i=2;i<=10;i=i+2)
{System.out.println("even number is"+i);
}
}
}
class odd implements Runnable
{
public void run()
{for(int i=1;i<=10;i=i+2)
{System.out.println("odd number is"+i);
}
}
}
class main29
{public static void main(String args[])
{even e=new even();
odd o=new odd();
Thread t1=new Thread(e);
Thread t2=new Thread(o);
t1.start();
t2.start();

}
}