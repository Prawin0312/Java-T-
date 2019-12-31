import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
class Streams2
{
   public static void main(String[] args)
   {
    //FileOutputStream fos = null;
	try(FileWriter fos= new FileWriter("abc.dat",true))
	{
	      //fos = new FileOutputStream("abc.dat");
		  for(int i=65;i<=90;i++)
		    fos.write(i);
	}
	catch(IOException ex)
	{
	      System.out.println(ex);
	}
	//finally
	//{
	   // try
		//{
		  // if(fos!=null)
		//f.close();
		//}
		//catch(IOException ex1)
		//{
		//System.out.println(ex1);
	    //}
   }
}