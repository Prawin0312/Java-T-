import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
class Dataout
{
   public static void main(String[] args)
   {
	try(FileOutputStream fos= new FileOutputStream("abc.dat");
	    DataOutputStream dos = new DataOutputStream(fos);)
	{
	   int i=217658987;
	   float f=12323123.6F;
	   double d=928377987423.99;
	   dos.writeInt(i);
	   dos.writeFloat(f);
	   dos.writeDouble(d);
	}
	catch(IOException ex)
	{
	      System.out.println(ex);
	}
  }
}