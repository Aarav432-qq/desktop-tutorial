class finallyDemo
{public static void main(String arr[])
{try
{int a=10/0;
}
catch(Exception e)
{System.out.println("Exception caught");

}
finally
{System.out.println("finally block executed");
}
}
}