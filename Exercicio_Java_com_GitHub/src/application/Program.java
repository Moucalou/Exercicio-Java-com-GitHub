package application;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		char answer = 'y';
		
		while (answer == 'y') {
			System.out.println("===== PRODUCTS MANAGER =====");
			System.out.println("1 - Product Register");
			System.out.println("2 - Products list");
			System.out.println("3 - Prouct exclusion");
			System.out.println("4 - Product change");
			System.out.println("5 - Exit");
			System.out.println("Select an option to continue");
			int num = sc.nextInt();
			sc.nextLine();
			
			
		
			switch (num) {
			case 1:
				System.out.print("Please enter the product name: ");
				String product = sc.nextLine();
				list.add(product);
				break;
			case 2:
				System.out.println("=== Products List ===");
				for (int i = 0; i < list.size(); i++) {
					System.out.println("Product #" + (i + 1) + ": " + list.get(i));
				}
				break;
			case 3:
				System.out.print("Enter the product number you want to remove from the list: ");
				int listnum = sc.nextInt();
				sc.nextLine();
				list.remove(listnum - 1);
				break;
			case 4:
				System.out.print("Enter the product number you want to change: ");
				listnum = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter the new product name: ");
				product = sc.nextLine();
				list.set((listnum - 1), product);
			}
		}
	}
}

