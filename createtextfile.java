import java.io.File;
import java.io.IOException;
class createtextfile
{public static void main(String arr[])
{try
{File file=new File("sample.txt");
if(file.createNewFile())
{System.out.println("file created succesfully"+file.getName());


}
else{System.out.println("file already exist");}
}
catch(IOException e)
{System.out.println("an error occured");
e.printStackTrace();}}}