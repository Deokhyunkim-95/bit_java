package day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Test04 {
	public static void main(String[] args) {
		String fileName = "data.obj";
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			
			
			System.out.println("Data Object Read  ");
			String name = (String) ois.readObject();
			Date date = (Date)ois.readObject();
			System.out.println("Read "+name);
			System.out.println("Read "+date);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (ois != null)
					ois.close();
				if (fis != null)
					fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
//public static void main(String[] args) {
//	String fileName = "data.obj";
//	FileOutputStream fis = null;
//	ObjectOutputStream oos = null;
//
//	try {
//
//	} catch (Exception e) {
//		System.out.println(e.getMessage());
//	} finally {
//		try {
//			if (oos != null)
//				oos.close();
//			if (fis != null)
//				fis.close();
//		} catch (Exception e2) {
//			e2.printStackTrace();
//		}
//	}
//}
//}
