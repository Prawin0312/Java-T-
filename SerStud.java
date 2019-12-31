package javatraining;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerStud implements java.io.Serializable
{
     public static void main(String[] args) {
    	 
     Student s = new Student(1011,"Ram",25,10,89,98,100);
     try(FileOutputStream fos=new FileOutputStream("stud.dat");
    		 ObjectOutputStream oos =new ObjectOutputStream(fos); )
     {
      oos.writeObject(s);
     }
     catch(IOException ex)
     {
    	 System.out.println(ex);
     }
}
}
