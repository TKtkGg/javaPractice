package explore;

import java.util.Scanner;

public class TextEnter {
	Scanner sc = new Scanner(System.in);
	public void textEnter(String text) {
		System.out.println(text + "(Enterで進む)");
		sc.nextLine();
	}
}
