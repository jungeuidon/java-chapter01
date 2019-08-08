package chapter01;

public class ArrayTest {

	public static void main(String[] args) {
		// implicit(암시적)
		int i = 10;
		long l = i;
		System.out.println(i + " : " + l);
		
		//explict(명시적) 
		int j = (int)l;
		System.out.println(j + " : " + l);
	}

}