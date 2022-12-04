package r2s.training.services;

import r2s.training.entities.Customer;
import r2s.training.entities.Order;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CustomerService {

    List<Customer> customerList= new ArrayList<>();
    OrderService orderService= new OrderService();
    List<Order> orders = new ArrayList<>();
//a. a.	Write a method to enter customer
    // data with a her/his list order, users will be asked whether to continue or finish.
    public void createCustomer() throws ParseException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----Enter Customer information---");

            System.out.print("Enter id: ");
            int id = scanner.nextInt();

            System.out.print("Enter name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            if (name.equals("n") || name.equals("N")) {
                break;
            }
            System.out.print("Enter phone: ");
            String phone = scanner.nextLine();
            if (phone.equals("n") || phone.equals("N")) {
                break;
            }
            System.out.print("Enter address: ");
            String address = scanner.nextLine();
            scanner.nextLine();
            if (address.equals("n") || address.equals("N")) {
                break;
            }


            String choose;
            // vòng lặp nhập order
            do {
                System.out.print("Do you want to add Order? \t1. Add \t2.Exit");
                choose = scanner.nextLine();
                if (choose.equals("1")) {
                    orders.add(orderService.createOrder(id));
                } else break;
            } while (choose.equals("1"));
            // tạo khách hàng với thông tin và list Order
            Customer customer = new Customer(id, name, phone, address, orders);
            customerList.add(customer);
        }
    }


//b.	The program has a method to get all of customers
    public List<Customer> findAll() {
        return customerList;
    }


//    c.	The program has a method to display data
    public void display(List<Customer> customerList) {
        for (Customer customer: customerList) {
            System.out.println(customer.toString());
        }
    }



//d.	The program has a method to search order by customer
    public List<Order> search(String phoneInput) {
        List<Order> listOrderByIdCus = new ArrayList<>();
        //tìm customer trùng sdt
        for (Customer customer : customerList) {
            if (customer.getPhoneNumber().equals(phoneInput)) {
                //lấy list order của customer có sdt trùng
                listOrderByIdCus = customer.getOrderList();
                return listOrderByIdCus;
            }
        }
        return listOrderByIdCus;
    }



//e.	Write a method to remove a specific customer by phone number from customer file
    public boolean remove(String phoneInput) {
        List<Order> listOrderByIdCus = new ArrayList<>();
        for (Customer customer : customerList) {
            if (customer.getPhoneNumber().equals(phoneInput)) {
                //lấy list order của customer có sdt trùng
                listOrderByIdCus = customer.getOrderList();
                customerList.remove(customer);
                orders.removeAll(listOrderByIdCus);
                return true;
            }
        }
        return false;
    }
}
