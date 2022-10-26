package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		List<Product> productsList = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data : ");
			System.out.print("Common, used or imported? (c/u/i) ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if (ch == 'c') {
				productsList.add(new Product(name, price));
			} else if (ch == 'u') {
				System.out.print("Manufactured date: ");
				Date manufacturedDate = sdf.parse(sc.next());
				productsList.add(new UsedProduct(name, price, manufacturedDate));

			}

			else {
				System.out.print("Customs Fee: ");
				Double customsFee = sc.nextDouble();
				productsList.add(new ImportedProduct(name, price, customsFee));

			}

		}
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product prod : productsList) {
			System.out.println(prod.priceTag());

		}

		sc.close();

	}

}
