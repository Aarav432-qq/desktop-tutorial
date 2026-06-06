abstract class students
{private String name;
private String stream;
public students(String nm,String st)
{name=nm;
stream=st;
}
abstract void marks();

public String toString()
{return "name is"+name+"stream is"+stream;}
}
class engineering extends students
{private int mark;
engineering(String nm,String st,int m)
{super(nm,st);
mark=m;
}

void marks()
{System.out.println("marks are"+mark);
}
}
class medicine extends students
{private int mark;
medicine(String nm,String st,int m)
{super(nm,st);
mark=m;
}

void marks()
{System.out.println("marks are"+mark);
}
}
class science extends students
{private int mark;
science(String nm,String st,int m)
{super(nm,st);
mark=m;
}

void marks()
{System.out.println("marks are"+mark);
}
}
class stuengmedsc
{public static void main(String args[])
{students s[]=new students[3];
s[0]=new engineering("Alice","Engineering",85);
s[1]=new medicine("Bob","Medicine",90);
s[2]=new science("Charlie","Science",80);

for(int i=0;i<3;i++)
{System.out.println(s[i]);
s[i].marks();
}
}
}