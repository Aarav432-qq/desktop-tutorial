import java.util.ArrayList;
class main2
{public static void main(String arr[])
{ArrayList<String>list=new ArrayList<>();
list.add("apple");
list.add("bananas");
list.add("orange");
System.out.println(list);
System.out.println(list.get(1));
list.set(1,"mango");
System.out.println(list);
System.out.println(list.contains("apple"));
System.out.println(list.size());
list.remove("orange");
System.out.println(list);
System.out.println(list.isEmpty());
list.clear();
System.out.println(list);
}


}
