import java.io.*;

class Student implements Serializable {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class studentfile2 {
    public static void main(String[] args) {
        try {
        
            Student s1 = new Student(101, "Amit", 85.5);

            ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("student.dat"));

            oos.writeObject(s1);
            oos.close();

            System.out.println("Object Written Successfully");

            
            ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("student.dat"));

            Student s = (Student) ois.readObject();
            ois.close();

            System.out.println("\nObject Read Successfully");
            s.display();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}