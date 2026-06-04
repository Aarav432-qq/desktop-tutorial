class multicatch
{public static void main(String arr[])
{try
{int a[]=new int[5];
a[10]=50;
int x=10/0;
}
catch(ArrayIndexOutOfBoundsException e)
{System.out.print("array index out of bounds");
}
catch(ArithmeticException e)
{System.out.print("cannot divide by zero");
}
}}