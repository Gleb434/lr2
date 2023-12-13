import java.util.Scanner;

public class zadacha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaner = new Scanner(System.in);
		System.out.print("Введите число: ");
		int num = scaner.nextInt();
		if(num%3==0) {
			System.out.println("Числов делится на 3");
		} else {
			System.out.println("Числов не делится на 3");
		}
	}

}
