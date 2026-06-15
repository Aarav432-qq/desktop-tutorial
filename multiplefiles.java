import java.io.File;
import java.io.IOException;
class multiplefiles
{public static void main(String arr[])
{
    try{for(int i=1;i<=5;i++)
    {File file=new File("File"+ i +".txt");
    file.createNewFile();}
    System.out.println("5 text files created successfully");
    }
    catch(IOException e)
    {System.out.println("error creating files");}
}}