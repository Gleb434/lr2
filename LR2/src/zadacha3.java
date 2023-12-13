import java.util.Scanner;

public class zadacha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaner = new Scanner(System.in);
		System.out.print("Введите число: ");
		int num = scaner.nextInt();
		if (num%4==0 && num>=10) {
			System.out.println("Числов делится на 4 и оно больше 10");
		} else {
			System.out.println("Числов меньше 10 или не делиться на 4");
		}
	}

}