import java.util.*;
class mobileException extends Exception
{mobileException(String msg)
{super(msg);
}

}
class mobilevalidation
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
try{System.out.print("enter mobile no");
String mob=sc.nextLine();
if(mob.length()==10&&mob.matches("[0-9]+"))
{System.out.println("valid mobile no");
}
else
{throw new mobileException("invalid mobile no");
}
}

catch(mobileException e)
{System.out.println(e.getMessage());
}
}
}