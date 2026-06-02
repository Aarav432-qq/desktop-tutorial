class item
{String n;
void getItem()
{n = "chips";}
}
class company extends item
{String c;
void getcompany()
{c = "lays";}

void showdetails()
{System.out.println("item name " + n);
System.out.println("company name " + c);
}
}
class main21
{public static void main(String args[])
{company c = new company();
c.getItem();
c.getcompany();
c.showdetails();
}
}


