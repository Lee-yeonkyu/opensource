package project;

import java.util.Scanner;

public class tiveth {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>> ");
		double x=a.nextDouble();
		double radious=a.nextDouble();
		double half=a.nextDouble();
		
		System.out.print("두번째 원의 중심과 반지름 입력>> ");
		double y=a.nextDouble();
		double radious2=a.nextDouble();
		double half2=a.nextDouble();
		
		double distance = Math.sqrt((x-y)*(x-y)+(radious-radious2)*(radious-radious2));
		if(distance < (half +half2))
			System.out.print("두 원은 서로 겹칩니다");
		else
			System.out.print("두 원은 서로 겹치지 않습니다.");
	}

}
