package project;

import java.util.Scanner;

public class sixth {

	public static void main(String[] args) {
	
		Scanner a=new Scanner(System.in);
		
		System.out.print("연산 >> ");
		double one = a.nextDouble();
		String x=a.next();
		double two = a.nextDouble();
		double sol;
		
		switch (x) {
		case "+":
			sol=one+two;
			System.out.print(one+x+two+"의 계산 결과는 "+sol);
			break;
		case "-":
			sol=one-two;
			System.out.print(one+x+two+"의 계산 결과는 "+sol);
			break;
		case "*":
			sol=one*two;
			System.out.print(one+x+two+"의 계산 결과는 "+sol);
			break;
		case "/":
			if(two==0) 
				System.out.print("0으로 나눌 수 없습니다.");
			else {
				sol=one/two;
				System.out.print(one+x+two+"의 계산 결과는 "+sol);
			break;
			}			
		}
	}

}
