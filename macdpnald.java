interface animal
{public String gettype();
    public void settype(String x);
    public String getsound();
    public void setsound(String x);
}
class cow implements animal
{String type;
String sound;
public void settype(String x)
{type=x;}
public String gettype()
{return type;}
public void setsound(String x)
{sound=x;}
public String getsound()
{return sound;}

}

class chick implements animal
{String type;
String sound;
public void settype(String x)
{type=x;}
public String gettype()
{return type;}
public void setsound(String x)
{sound=x;}
public String getsound()
{return sound;}
}

class macdpnald
{public static void main(String arr[])
{
    animal c[]=new animal[2];
    c[0]=new cow();
    c[0].settype("cow");
    c[0].setsound("moo");
    c[1]=new chick();
    c[1].settype("chick");
    c[1].setsound("cluck");
    for(int i=0;i<2;i++)
    {System.out.println("animal name"+(i+1)+" "+c[i].gettype());
        
System.out.println("animal sound "+c[i].getsound());
    }
}
    }

