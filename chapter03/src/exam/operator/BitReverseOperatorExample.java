package exam.operator;

public class BitReverseOperatorExample {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = -v1;
		int v3 = -v1 + 1;
		
		System.out.println(Integer.toBinaryString(v1));
		System.out.println(Integer.toBinaryString(v2));
		System.out.println(Integer.toBinaryString(v3));
		
		
	}
	
	public static String toBinaryString(int value) {
		String str = Interger.toBinaryString(value);
		while(str.length()<32) {
			str="0"+str;
		}
		
		return str;
	
	}

}
