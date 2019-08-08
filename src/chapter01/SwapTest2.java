package chapter01;

public class SwapTest2 {
	
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		System.out.println(i + ":" + j);
		
		swap(i, j);
		System.out.println(i + ":" + j);  //안바뀌어 있다. 
	}
	
	public static void swap(int p, int q) {
		int temp = p;
		p = q;
		q = temp;
		
	}
}
