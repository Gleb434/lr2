import java.util.Scanner;

public class zadacha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaner = new Scanner(System.in);
		System.out.print("Введите число: ");
		int num = scaner.nextInt();
		if (num%5==2) {
			System.out.println("Числов делится на 5 c остатком 2");
		} else if (num%7==1) {
			System.out.println("Числов делится на 7 с остатком 1");
		} else {
			System.out.println("Числов не делится");
		}
	}

}
