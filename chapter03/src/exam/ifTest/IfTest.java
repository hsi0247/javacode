package exam.ifTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int com = (int)(Math.random()*6+1);
		System.out.println(com);
		int player = scan.nextInt();
		if(com==player) {
			System.out.println("정답");
		}else {
			System.out.println("다음기회를");
		}
	} 
		
	
}
