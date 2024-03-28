package basicstuff;

public class SecondJavaProgram {

	public static void main(String[] args) {
		
		int a = 5;
		double b = 3.14;
		char c = 's';
		String str = "Arun Motoori";
		boolean d = true;
		
		System.out.printf("Integer value is %d%n",a);
		System.out.printf("Double value is %f%n",b);
		System.out.printf("Character value is %c%n",c);
		System.out.printf("String value is %s%n",str);
		System.out.printf("Boolean value is %b%n",d);
		
		System.out.printf("Integer %d Double %f Character %c String %s Boolean %b%n",a,b,c,str,d);
		System.out.printf("Integer %d Double %f Character %C String %S Boolean %B",a,b,c,str,d);

	}

}
