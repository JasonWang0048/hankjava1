package com.tom;

public class StringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello world";
		String s2 = new String("Hello world");
		System.out.println(s == s2);
		System.out.println(s.equals(s2));
		System.out.println(s.substring(8));		//�q�ĴX�Ӷ}�l�L
		System.out.println(s.substring(2, 7));
		
//		�L�Xdlrow olleH (�Ns�r��ϹL�ӦL)
		for(int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		String s3 = new String("Jack Tom Eric");
		System.out.println(s3.lastIndexOf('c'));
		
//		�Ns3�r�ꤺ��Tom���令boss
//		�Y Jack boss Eric
/*		s3 = s3.replace("Tom", "boss");
		System.out.println(s3);			*/
		String name = "Tom";
		int index = s3.indexOf(name);
		System.out.println(s3.substring(0, index) + "boss" + s3.substring(index + name.length()));
		
//		Wrapper classes
		int n = Integer.parseInt("12");
		String x = String.valueOf(10);
		float f = Float.parseFloat("98.7");
		System.out.println(n + "  " + x + "  " + f);
	}
}
