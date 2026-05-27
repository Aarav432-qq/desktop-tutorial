import java.util.*;
class main3
{public static void main(String arr[])
{ArrayList<String>list=new ArrayList<>();
list.add("apple");
list.add("bananas");
list.add("orange");
System.out.println("add()"+list);

list.add(1,"mango");
System.out.println("add(index,element)"+list);
System.out.println("get()"+list.get(2));
list.set(0,"grapes");
System.out.println("set()"+list);
System.out.println("contains()"+list.contains("bananas"));
System.out.println("indexOf()"+list.indexOf("bananas"));
list.add("bananas");
System.out.println("lastIndexOf()"+list.lastIndexOf("bananas"));
System.out.println("size()"+list.size());
list.remove(1);
System.out.println("remove(index)"+list);
list.remove("orange");
System.out.println("remove(object)"+list);
System.out.println("isEmpty()"+list.isEmpty());
ArrayList<String>copy=(ArrayList<String>)list.clone();
System.out.println("clone()"+copy);
System.out.println("equals()"+list.equals(copy));
ArrayList<String>list2=new ArrayList<>();
list2.add("kiwi");
list2.add("papaya");
list.addAll(list2);
System.out.println("addAll()"+list);
System.out.println("containsAll()"+list.containsAll(list2));
System.out.println("subList()"+list.subList(1,3));
Object objArr[]=list.toArray();
System.out.println("toArray()");
for(Object x:objArr)
System.out.println(x);
Collections.sort(list);
System.out.println("sort()"+list);
System.out.println("forEach()");
list.forEach(n->System.out.println(n));
list.removeAll(list2);
System.out.println("removeAll()"+list);
list.clear();
System.out.println("clear()"+list);
System.out.println("isEmpty()"+list.isEmpty());


}


}
