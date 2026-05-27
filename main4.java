import java.util.LinkedList;
class main4
{public static void main(String arr[])
{LinkedList<String>list=new LinkedList<>();
list.add("apple");
list.add("banana");
list.add("orange");
list.addFirst("mango");
list.addLast("grapes");
System.out.println("LinkedList"+list);
System.out.println("getFirst()"+list.getFirst());
System.out.println("getLast()"+list.getLast());
list.removeFirst();
list.removeLast();
System.out.println("LinkedList after removing first and last element"+list);
System.out.println("contains()"+list.contains("banana"));
System.out.println("size"+list.size());
list.set(1,"kiwi");
System.out.println("LinkedList after setting element at index 1"+list);
list.clear();
System.out.println("LinkedList after clear()"+list);
}
}
