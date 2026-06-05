import java.util.*;
class inavlidEmailException extends Exception
{inavlidEmailException(String msg)
{super(msg);
}
}
class emailvalidation
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
try{System.out.print("enter email id");
String email=sc.nextLine();
if(email.contains("@")&&email.endsWith(".com"))
{System.out.println("valid email id");
}
else{throw new inavlidEmailException("invalid email id");
}
}

catch(inavlidEmailException e)
{System.out.println(e.getMessage());
}
}
}