package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("c://lib//sample.txt");) { //오토클로징 ,closable을 구현한 애들만 오토클로징이 가능하다.
			System.out.println("file 처리~~~~");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		System.out.println("=======================================");
		
		try(Scanner scanner = new Scanner(new File("c://lib//sample.txt"));) {
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
