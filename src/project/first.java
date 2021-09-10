package project;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99)>>");
		
		int number = a.nextInt();
		int one = number % 10;
		int ten = (number-one)/10;
		
		if(one==ten)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
	}

}
