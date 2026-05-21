import java.util.*;
class string
{public static void main(String arr[])
{Scanner sc=new Scanner(System.in);
System.out.print("enter a string");
String s=sc.nextLine();
System.out.println("Lengthof string is"+s.length());
System.out.println("Uppercase string is"+s.toUpperCase());
System.out.println("lowercase string is"+s.toLowerCase());
System.out.println("character at position 2"+s.charAt(2));
System.out.println("substring from 2 to 5 is"+s.substring(2,5));
System.out.println("Contains 'java'"+s.contains("java"));
System.out.println("Replace 'a' with '*'"+s.replace('a','*'));
System.out.println("Equals 'hello'"+s.equals("hello"));
}

}