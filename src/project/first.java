package project;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		
		int number = a.nextInt();
		int one = number % 10;
		int ten = (number-one)/10;
		
		if(one==ten)
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
	}

}
