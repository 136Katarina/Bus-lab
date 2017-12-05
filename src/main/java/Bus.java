import sun.awt.AWTAccessor;

import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String inputDest, int inputCapacity){
        this.destination = inputDest;
        this.capacity = inputCapacity;
        this.passengers = new ArrayList<>();
    }

    public int passengersCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person personInput) {
        if (this.passengersCount() < capacity ){
        this.passengers.add(personInput);
        };
    }


    public int removePassenger(Person personInput) {


    }
}
