package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Employee> employee = new ArrayList<>();

		System.out.print("How many employees? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.print("Outsourced? (y/n) ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				employee.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
				else if (ch == 'n') {
				employee.add(new Employee(name, hours, valuePerHour));
			}
			
				else {
					System.out.println("Invalid value. Employee's payment will not be read. Try Again with 'y' or 'n'.");
				}

			
			}
		
		System.out.println();
		System.out.println("Payments:");
		for (Employee emp : employee) {
			System.out.println(emp.getName() + " - " + String.format("%.2f", emp.payment()));

		}

		sc.close();

	}

}
