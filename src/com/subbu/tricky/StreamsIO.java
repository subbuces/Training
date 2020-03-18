/**
 * 
 */
package com.subbu.tricky;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author subbaraop
 *
 */
public class StreamsIO {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		consoleInput();
//		fileInputStream();
		bufferReader();
	}

	static void consoleInput() throws IOException {
		System.out.print("Enter Value of i: ");
		int i = System.in.read();
		System.out.println(i);
//		System.out.println(i);
	}

	static void fileInputStream() throws IOException {

		try {
//			FileInputStream input = new FileInputStream("E:\\AAALearning\\data.txt");
			FileInputStream input = new FileInputStream("E:\\AAALearning\\JavaTraining\\testdata.txt");
			int data = input.read();
//			System.out.println("file data : " + (char) data);
			while (data != -1) {
				System.out.print((char) data);
				data = input.read();
			}
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void bufferReader() throws IOException {
		File data = new File("E:\\AAALearning\\JavaTraining\\testdata.txt");
		BufferedReader text = new BufferedReader(new FileReader(data));
		String br;
		System.out.print("---Buffered Reader---\n");
		while ((br = text.readLine()) != null) {
			System.out.println(br);
		}

		FileReader fr = new FileReader("E:\\AAALearning\\JavaTraining\\testdata.txt");
		int i;
		System.out.print("---File Reader---\n");
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}

		File fl = new File("E:\\AAALearning\\JavaTraining\\testdata.txt");
		Scanner sc = new Scanner(fl);
		System.out.print("---Scanner---\n");
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}
}
