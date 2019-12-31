import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
class Buffout
{
   public static void main(String[] args)
   {
	try(FileOutputStream fos= new FileOutputStream("abc.dat");
	    BufferedOutputStream bos = new BufferedOutputStream(fos);
	)
	    
	{
	   for(int i=65;i<=90;i++)
	   bos.write(i);
	}
	catch(IOException ex)
	{
	      System.out.println(ex);
	}
  }
}