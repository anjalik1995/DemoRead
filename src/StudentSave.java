
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSave {
	public static void main(String[] args) throws IOException{
		Student s = new Student();
		s.name="sneha";
		s.dept="CS";
		s.per=86.7;
		
		FileOutputStream fos=new FileOutputStream("SData.txt");
		ObjectOutputStream ops=new ObjectOutputStream(fos);
		ops.writeObject(s);
		ops.close();
		System.out.println("App end");
		
	}

}

