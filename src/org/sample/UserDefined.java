package org.sample;

import java.util.Scanner;

public class UserDefined {
	public static void main(String[] args) throws StringNotFoundException {
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		if (name.equalsIgnoreCase("Ms Dhoni")) {
			System.out.println("Captain the cool");
		} else {
			throw new StringNotFoundException();

		}
		
		
		
		
	}

}
