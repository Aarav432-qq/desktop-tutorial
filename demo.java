class demo
{demo()
{this(100);
System.out.println("Default constructor called");
}
demo(int x)
{System.out.println("Parameterized constructor called with value: " + x);}
public static void main(String args[])
{demo d=new demo();
}
}