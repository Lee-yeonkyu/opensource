package project;

import java.util.Scanner;

public class sixth {

	public static void main(String[] args) {
	
		Scanner a=new Scanner(System.in);
		
		System.out.print("���� >> ");
		double one = a.nextDouble();
		String x=a.next();
		double two = a.nextDouble();
		double sol;
		
		switch (x) {
		case "+":
			sol=one+two;
			System.out.print(one+x+two+"�� ��� ����� "+sol);
			break;
		case "-":
			sol=one-two;
			System.out.print(one+x+two+"�� ��� ����� "+sol);
			break;
		case "*":
			sol=one*two;
			System.out.print(one+x+two+"�� ��� ����� "+sol);
			break;
		case "/":
			if(two==0) 
				System.out.print("0���� ���� �� �����ϴ�.");
			else {
				sol=one/two;
				System.out.print(one+x+two+"�� ��� ����� "+sol);
			break;
			}			
		}
	}

}
