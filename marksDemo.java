class marksDemo
{public static void main(String arr[])
{
int marks =-2;
try
{if (marks<0)
{throw new ArithmeticException("marks cannot be negative");
}
else
{System.out.print("valid marks");
}
}
catch(ArithmeticException e)
{System.out.print("exception occurred");
}

}}