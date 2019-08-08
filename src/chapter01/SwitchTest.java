package chapter01;

public class SwitchTest {

	public static void main(String[] args) {
		int i = 10;
		
		if(i == 10) { 
			System.out.println("내가 10이다 임마");
		}else if(i==30) {
			
		}else if(i ==50) {
			
		}
		String s = "hello";
		if( s == "hello") {
			System.out.println("if문원래안되야 되는데 이것도됨 hello==hello");
		}
		
		switch(s) {
			case "h" :{
				System.out.println("h라서 안찍힘");
				break;
			}
			case "e":{
				System.out.println("e라서 안찍힘 ");
				break;
			}
			default:{
				System.out.println("default라서 찍힌다.");
				break;
			}
		}
		
		

		switch(i) {
		case 10:
			i++;
			System.out.println(i+10);
			break;
		case 30:
			break;
		case 50:
			break;
		}
	}

}
