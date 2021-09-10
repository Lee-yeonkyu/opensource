package project;

import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int number=a.nextInt();
		
		int one = number % 10;
		int ten = (number-one)/10;
		if(one%3==0||ten%3==0) {
			if(one%3==0&&ten%3==0)
				System.out.print("¹Ú¼öÂ¦Â¦");
			else
				System.out.print("¹Ú¼öÂ¦");
		}
		else
			System.out.print("¹Ú¼ö ¾øÀ½");
	}

}
