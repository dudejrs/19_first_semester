import java.util.Scanner;

public class if_expression {
	public static void main(String[] args){
		Scanner scan1 = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int score = scan1.nextInt();
		System.out.print("�г��� �Է��ϼ��� : ");
		int year = scan1.nextInt();
		
		if(score>=60) {
			if(year != 4) System.out.println("�հ�!");
			else if(score >= 70) System.out.println("�հ�!");
			else System.out.println("���հ�!");
		}
		else System.out.println("���հ�!");
		
		scan1.close();
		
		
	}
}
