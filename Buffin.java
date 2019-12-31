import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
class Buffin
{
   public static void main(String[] args)
   {
	try(FileInputStream fis= new FileInputStream("abc.dat");
	    BufferedInputStream bis = new BufferedInputStream(fis);
	)
	    
	{
	   int ch;
	   while((ch=bis.read())!=-1)
	   System.out.println((char)(ch)+" ");
	}
	catch(IOException ex)
	{
	      System.out.println(ex);
	}
  }
}