
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFinally {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois=null;
		try {
			fis = new FileInputStream("SData.txt");
			//ObjectInputStream ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			Student s=null;
			if (o instanceof Student)
				s = (Student) o;
			System.out.println(s.name + "  " + s.dept + " " + s.per);
		//	ois.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(fis!=null)
			{
				try {
					fis.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
				if(ois!=null)
				{
					try {
					ois.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
					
			}
		}

	}

}
}