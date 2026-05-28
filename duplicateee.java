import java.util.*;
class duplicateee
{public static void main(String arr[])
{ArrayList<Integer>list=new ArrayList<Integer>();
list.add(10);
list.add(20);
list.add(10);
list.add(30);
list.add(20);
list.add(40);
System.out.println("original list"+list);
HashSet<Integer>set=new HashSet<Integer>(list);
ArrayList<Integer>uniquelist=new ArrayList<Integer>(set);
System.out.println("list after removing duplicates"+uniquelist);
}}  
