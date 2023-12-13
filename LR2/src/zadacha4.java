import java.util.Scanner;

public class zadacha4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaner = new Scanner(System.in);
		System.out.print("Введите число: ");
		int num = scaner.nextInt();
		if (num>=1000) {
			int rez = num / 1000 % 10;
			System.out.println("В этом числе " + num + " тысыча входит " + rez + " раз");
		} else {
			System.out.println("Числов меньше 1000");
		}
	}

}