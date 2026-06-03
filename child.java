interface father
{void show1();
}   
interface mother
{void show2();
}
class child implements father,mother
{public void show1()
{System.out.println("i am father");}
public void show2()
{System.out.println("i am mother");}
public static void main(String args[])
{child c=new child();
c.show1();
c.show2();
}
}
