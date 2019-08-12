package day07;

import java.util.Scanner;

import util.MyUtil;

public class Prob1 {
	public static void main(String args[]) {
		
		Prob1 prob1 = new Prob1();
		
		System.out.println("==========Left==========");
		System.out.println( prob1.leftPad("bit", 6, '#') );
		System.out.println( prob1.leftPad("bit", 5, '$') ); 
		System.out.println( prob1.leftPad("bit", 2, '&') ); 
		
		System.out.println("==========Right==========");
		System.out.println( prob1.RightPad("bit", 6, '#') );
		System.out.println( prob1.RightPad("bit", 5, '$') ); 
		System.out.println( prob1.RightPad("bit", 2, '&') ); 
		
	}
	public String leftPad(String str, int size, char padChar) {
		/*  여기에 프로그램을 완성하십시오. */
		String sum = null;
		if(str.length()>size)
		{
			return str;
		}
//1.		else {
//			sum = padChar+str;
//			for(int i = 0 ; i< size-str.length()-1; i++) {
//				sum = padChar+sum;
//			}
//		}
		
//2.
		int count = size - str.length();
		for(int i = 0 ; i<count;i++) {
			str = padChar+str;
		}
		return str;
	}
	public String RightPad(String str, int size, char padChar) {
		/*  여기에 프로그램을 완성하십시오. */
		String sum = null;
		if(str.length()>size)
		{
			return str;
		}
		int count = size - str.length();
		for(int i = 0 ; i<count;i++) {
			str = str+padChar;
		}
		return str;
	}
}