package r2s.training.entities;

import java.util.List;

public class Customer {
//    name (String), phone number (String),
//    address (String), and list of orders (of the class r2s.training.entities.Order you have just created).
    private int id;
    private String name;
    private  String phoneNumber;
    private String address;
    private List<Order> orderList;

    public Customer() {
    }

    public Customer(int id, String name, String phoneNumber, String address, List<Order> orderList) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.orderList = orderList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return
                "Id=" + id +
                "\tName='" + name + '\'' +
                "\tNhoneNumber='" + phoneNumber + '\'' +
                "\tAddress='" + address + '\'' +
                "\tOrderList=" + orderList.toString();
    }
}
