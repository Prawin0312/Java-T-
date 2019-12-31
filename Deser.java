package javatraining;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;

public class Deser {
             public static void main(String[] args)
             {
             Student s = null;
             try(FileInputStream fis=new FileInputStream("stud.dat");
            ObjectInputStream ois=new ObjectInputStream(fis);)
             {
             s = (Student)ois.readObject();
            System.out.println(s.getRno()+" "+s.getM1()+" "+s.getM2()+" "+s.getM3()+" "+s.getSsn()+" "+s.getName()+" "+s.getAge());
            }
            catch(IOException | ClassNotFoundException ex)
            {
            	System.out.println(ex);
              } 
        }
}
