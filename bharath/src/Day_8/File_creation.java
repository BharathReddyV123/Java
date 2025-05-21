              // creating a file 

//package Day_8;
//import java.io.*;
//public class File_creation {
//
//	public static void main(String[] args) throws IOException {
//		File f1=new File("C:\\Users\\ADMIN\\OneDrive\\Desktop\\bharath.txt");
//		if(f1.createNewFile()) {
//			System.out.print("file created success");
//		}
//		else {
//			System.out.println("file not created");
//		}
//		// TODO Auto-generated method stub
//	}
//}
//
//_________________________________________________________
// writing text to the created file
package Day_8;
import java.io.*;
public class File_creation {

	public static void main(String[] args) throws IOException {
		FileWriter f1=new FileWriter("C:\\Users\\ADMIN\\OneDrive\\Desktop\\bharath.txt");
		f1.write("hi bharath");
		f1.close();
		System.out.println("success");
	}
		// TODO Auto-generated method stub
	
}


