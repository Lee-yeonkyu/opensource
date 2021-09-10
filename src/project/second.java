package project;

import java.util.Scanner;

public class second {
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("정수 3개 입력");
		
		int one = a.nextInt();
		int two = a.nextInt();
		int three = a.nextInt();
		
		int mid; int max; int min;
		
		max= one > two ? one:two;
		max= max>three?max:three;
		min=one<two?one:two;
		min=min<three?min:three;
		mid=one+two+three-max-min;
		
		System.out.print("중간값은 "+ mid);
		}
	}
