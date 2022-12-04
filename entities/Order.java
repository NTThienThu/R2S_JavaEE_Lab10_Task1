package r2s.training.entities;

import java.util.Date;

public class Order {
    //    number (String), date (Date), quantity, price.
    private String number;
    private Date date;
    private int quantity;
    private long price;

    private int customerId;

    public Order() {
    }

    public Order(String number, Date date, int quantity, long price, int customerId) {
        this.number = number;
        this.date = date;
        this.quantity = quantity;
        this.price = price;
        this.customerId = customerId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order:" +
                "\tNumber='" + number + '\'' +
                "\tDate=" + date +
                "\tQuantity=" + quantity +
                "\tPrice=" + price;
    }
}
