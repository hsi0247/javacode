package exam.ifTest;

import java.util.Scanner;

public class GuessMyNumber {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String retry = "Y";

		while(retry.equals("Y")) {
			System.out.println("맞추실 최대의 수를 입력하세요");
			int range = scan.nextInt();
			
			int randomNum = (int)(Math.random()*range)+1;
			
			int count = 0;
			int min = 1;
			int max = range;
			double score = range;
			
			while(score>0) {
				System.out.print("숫자 입력 : ");
				int input = scan.nextInt();
				
				if(input < randomNum) {
					min = input;
					System.out.println(min+"~"+max+" 사이의 숫자를 입력해주세요");
				}else if(input > randomNum) {
					max = input;
					System.out.println(min+"~"+max+" 사이의 숫자를 입력해주세요");
				}else {
					break;
				}
				count++;
				score -= 10;
			}
			
			if(score>0) {
				System.out.println(count + "번 만에 맞췄습니다");
				System.out.println("당신의 점수는 "+score+" 점 입니다");
			}else {
				System.out.println("당신은 실패했습니다");
			}
			
			System.out.println("재도전 하시겠습니까? (Y/N)");
			while(true) {
				retry = scan.next();
				if(retry.equals("Y") || retry.equals("N")) {
					System.out.println("다시 입력하십시오");
				}else {
					break;
				}
			}
		}
	}
}
