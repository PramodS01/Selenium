import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSaveDemo {

		
		public static void main(String[] args)throws IOException {
	Employee e=new Employee();
	e.name="Rashi";
	e.profile="HR";
	e.sal=1500;
	e.comm=500.50;
	try{
	FileOutputStream fos=new FileOutputStream("Edata.txt");
	ObjectOutputStream ops=new ObjectOutputStream(fos);
	ops.writeObject(e);
	ops.close();
	System.out.println("Done");
}catch(Exception e1){
e1.printStackTrace();	
}
}
		}
