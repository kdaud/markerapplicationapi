/**
 * 
 */
package com.mycodebase.db;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author opensource
 *
 */
public class Committer {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student obj = new Student();
		obj.setName("Daud Kakumirizi");
		obj.setCourse("BS in Software Engineering");
		obj.setCpa(4.88);
		
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("/home/opensource/Music/daud.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(obj);
			objectOutputStream.close();
			fileOutputStream.close();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
