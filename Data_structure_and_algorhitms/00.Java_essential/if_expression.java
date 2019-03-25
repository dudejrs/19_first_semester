import java.util.Scanner;

public class if_expression {
	public static void main(String[] args){
		Scanner scan1 = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = scan1.nextInt();
		System.out.print("학년을 입력하세요 : ");
		int year = scan1.nextInt();
		
		if(score>=60) {
			if(year != 4) System.out.println("합격!");
			else if(score >= 70) System.out.println("합격!");
			else System.out.println("불합격!");
		}
		else System.out.println("불합격!");
		
		scan1.close();
		
		
	}
}
