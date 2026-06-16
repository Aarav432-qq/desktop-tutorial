import java.nio.file.Files;
import java.nio.file.Path;
class readfile2
{public static void main(String arr[])
{try
{String content=Files.readString(Path.of("prime.java"));
System.out.println(content);
}catch(Exception e)
{System.out.println(e);
}
}
}