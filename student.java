class student{
    int id;
    String name;
    student(int id, String name)
    {this.id=id;
    this.name=name;}
    void display()
    {System.out.println("ID: " + id + ", Name: " + name);}
    public static void main(String args[])
    {student s=new student(1, "Alice");
    s.display();
    }
}