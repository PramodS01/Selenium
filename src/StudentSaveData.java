import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSaveData  {
	
	public static void main(String[] args)throws IOException {
Student s=new Student();
s.name="Binod";
s.dept="CS";
s.per=85.5;
FileOutputStream fos=new FileOutputStream("Sdata.txt");
ObjectOutputStream ops=new ObjectOutputStream(fos);
ops.writeObject(s);
ops.close();
System.out.println("App ends");
	}

}
