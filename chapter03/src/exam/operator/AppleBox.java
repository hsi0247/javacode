package exam.operator;

import java.util.Scanner;

public class AppleBox {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("사과개수를 입력하세요");
		int apple = scan.nextInt();
		System.out.println("박스당 개수를 입력하세요");
		int box = scan.nextInt();
		
		int in_apple = apple/box;
		int in_box= apple%box;
		
		System.out.println("사과의 총 개수는"+apple);
		System.out.println(box+"박스"+in_box+"개");
		
	}

}
