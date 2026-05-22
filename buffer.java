class buffer
{public static void main(String arr[])
{StringBuffer sb=new 
StringBuffer("hello");
sb.append("world");
System.out.println("append()"+sb);
sb.insert(5," ");
System.out.println("insert()"+sb);
sb.replace(6,10,"c++");
System.out.println("replace()"+sb);
sb.delete(6,10);
System.out.println("delete()"+sb);
sb.reverse();
System.out.println("reverse()"+sb);
sb.length();
System.out.println("length()"+sb.length());
System.out.println("capacity()"+sb.capacity());
System.out.println("charAt(0)"+sb.charAt(0));
sb.setCharAt(0,'H');
System.out.println("setCharAt()"+sb);
System.out.println("substring(0,5)"+sb.substring(0,5));
sb.ensureCapacity(50);
System.out.println("ensureCapacity()"+sb.capacity());
String str=sb.toString();
System.out.println("toString()"+str);

}
}