package project;

import java.util.Scanner;

public class fourth {

	public static void main(String[] args) {
		int rx1 =100;
		int rx2 =100;
		int ry1 =200;
		int ry2 =200;
		
		Scanner a = new Scanner(System.in);
		System.out.print("���� 4���� �Է��Ͻÿ�.");
		int x1=a.nextInt();
		int x2=a.nextInt();
		int y1=a.nextInt();
		int y2=a.nextInt();
		
		if(((x1>=rx1 && x1<=rx2)&&(y1>=ry1 && y1<=ry2))||((x2>=rx1 && x2<=rx2)&&(y2>=ry1 && y2<=ry2)))
			System.out.print("�浹�մϴ�!");
		else
			System.out.print("�浹�����ʽ��ϴ�");
		
	}

} 
