package project;

import java.util.Scanner;

public class tiveth {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>> ");
		double x=a.nextDouble();
		double radious=a.nextDouble();
		double half=a.nextDouble();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>> ");
		double y=a.nextDouble();
		double radious2=a.nextDouble();
		double half2=a.nextDouble();
		
		double distance = Math.sqrt((x-y)*(x-y)+(radious-radious2)*(radious-radious2));
		if(distance < (half +half2))
			System.out.print("�� ���� ���� ��Ĩ�ϴ�");
		else
			System.out.print("�� ���� ���� ��ġ�� �ʽ��ϴ�.");
	}

}
