package r2s.training.main;

import r2s.training.entities.Customer;
import r2s.training.entities.Order;
import r2s.training.services.CustomerService;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        CustomerService customerService = new CustomerService();
        int select;
        Scanner sc = new Scanner(System.in);
        System.out.print("choose your funtion: ");

        do {
            System.out.println("____________________________");
            System.out.println("1.Add a new Customer");
            System.out.println("2.Show all Customer");
            System.out.println("3.Search Customer");
            System.out.println("4.Remove Customer");
            System.out.println("5.Exit");
            System.out.println("____________________________");

            select = sc.nextInt();
            sc.nextLine();
            switch (select) {
                case 1: {
                    customerService.createCustomer();
                    break;
                }
                case 2: {
                    List<Customer> customers = customerService.findAll();
                    customerService.display(customers);
                    sc.nextLine();
                    break;
                }

                case 3: {
                    System.out.println("Input search phone number");
                    String phonIp= sc.nextLine();
                   // List<Order> orderList = customerService.search(phonIp);
                    for (Order od: customerService.search(phonIp)) {
                        System.out.println(od.toString());
                    }
                    break;
                }
                case 4: {
                    System.out.println("Input remove phone number");
                    sc.nextLine();
                    String phonIp= sc.nextLine();
                    customerService.remove(phonIp);
                    break;
                }
                case 5: {
                    System.out.println("Exit");
                    System.exit(0);
                }
            }
        }
        while (select != 0);
    }
}