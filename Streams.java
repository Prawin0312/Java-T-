import java.io.File;
class Streams
{
   public static void main(String[] args)
   {
     File f = new File("test.java");
	 System.out.println(f.isFile());
	 System.out.println(f.length());
	 System.out.println(f.isDirectory());
	 System.out.println(f.canRead());
	 System.out.println(f.getName());
	 System.out.println(f.canExecute());
	 //f.delete();   ---> to delete the file.
   }
}