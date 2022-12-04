package r2s.training.services;

import r2s.training.entities.Order;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class OrderService {
    public static Order createOrder(int idCus) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter order infor: ");
        System.out.print("+ number: ");
        String number = scanner.nextLine();
        System.out.print("+ date: ");
        String date = scanner.nextLine();
        System.out.print("+ quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("+ price: ");
        int price = scanner.nextInt();
        Date date1;
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        Order order = new Order(number, date1, quantity, price, idCus);
        return order;
    }
}


