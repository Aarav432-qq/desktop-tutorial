class throwDemo
{public static void main(String arr[])
{int age=15;
try
{if(age<18)
{throw new
ArithmeticException("not valid");
}
else
{System.out.print("valid age");
}
}
catch(ArithmeticException e)
{System.out.print("exception occurred");
}
}
}