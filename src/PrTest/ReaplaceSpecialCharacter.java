package PrTest;

public class ReaplaceSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My n@am&e is Riya@";
		str=str.replaceAll("[^a-zA-Z0-9 ]","");
		System.out.println(str);

	}

}
