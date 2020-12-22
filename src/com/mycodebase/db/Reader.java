package com.mycodebase.db;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
	
	File file = new File("/home/opensource/Music/daud.ser");
	
	public void showFile() throws FileNotFoundException {
		Scanner scanner = new Scanner(file);
		System.out.println(scanner.nextLine());
	}

	
}
