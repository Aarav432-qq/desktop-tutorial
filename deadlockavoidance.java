class Resource
{public synchronized void use(String threadname)
{System.out.println(threadname+" is using the resource");
try
{Thread.sleep(1000);
}
catch(InterruptedException e){
    System.out.println(e);
}
}
}
class MyThread extends Thread
{private Resource r1;
private Resource r2;
 MyThread(Resource r1,Resource r2)
 {this.r1=r1;
 this.r2=r2;
 }
 public void run(){
 synchronized(r1)
 {System.out.println(Thread.currentThread().getName()+" has locked resource 1");
 synchronized(r2)
    {System.out.println(Thread.currentThread().getName()+" has locked resource 2");
    r1.use(Thread.currentThread().getName());
    r2.use(Thread.currentThread().getName());
    }
 }

 }
}
class deadlockavoidance
{public static void main(String args[])
{Resource r1=new Resource();
Resource r2=new Resource();
MyThread t1=new MyThread(r1,r2);
MyThread t2=new MyThread(r2,r1);
t1.setName("Thread A");
t2.setName("Thread B");
t1.start();
t2.start();
}
}
