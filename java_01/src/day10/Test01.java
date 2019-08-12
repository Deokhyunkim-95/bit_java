package day10;

public class Test01 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		System.out.println("java progRamIng".equals("java progRamIng"));
		System.out.println("java progRamIng".equals("jAVA progRamIng"));
		System.out.println("java progRamIng".equalsIgnoreCase("java progRamIng"));
		System.out.println("java progRamIng".equalsIgnoreCase("JAVA"));
		System.out.println("java progRamIng".equalsIgnoreCase("java"));
		System.out.println("java progRamIng".contains("JAVA"));
		System.out.println("java progRamIng".toLowerCase().contains("JAVA"));
		System.out.println("java progRamIng".toLowerCase().contains("JAVA".toLowerCase()));
	}

}
