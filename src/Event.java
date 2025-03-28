import java.util.ArrayList;

public class Event {
    private String name;
    private String date;
    private String location;
    private int maxNumberOfSeats;
    private int availableSeats;
    private double price;

    public Event(String name, double price) {
        this.name = name;
        this.price = price;
        this.maxNumberOfSeats = 100;
        this.availableSeats = 100;
        this.date = "Not specified";
        this.location = "Not specified";
    }


    public Event(String name, double price, String date) {
        this(name, price);
        this.date = date;
    }

    //overloading not working; ergo no use
    public Event(String name, double price, String date, String location) {
        this(name, price, date);
        this.location = location;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMaxNumberOfSeats() {
        return maxNumberOfSeats;
    }

    public void setMaxNumberOfSeats(int maxNumberOfSeats) {
        this.maxNumberOfSeats = maxNumberOfSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void reserveSeat() {
        if (availableSeats > 0) {
            availableSeats--;
        } else {
            System.out.println("No available seats for this event.");
        }
    }

    @Override
    public String toString() {
        return "Event: " + name + "\nDate: " + date + "\nLocation: " + location +
                "\nPrice: " + price + "\nAvailable Seats: " + availableSeats;
    }
}