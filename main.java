import java.util.ArrayList;
class main
{public static void main(String arr[])
{
    ArrayList<Integer>numbers=new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    System.out.println(numbers.get(1));
    numbers.set(1,50);
    System.out.println(numbers);
    numbers.remove(0);
    System.out.println(numbers);
    System.out.println(numbers);
    System.out.println("size"+numbers.size());
}
}
    
