public class Motorcycle extends Vehicle {
    private int price_per_hour = 20;

    public Motorcycle(String vehicle_name, int price_per_hour) {
        super(vehicle_name);
        this.price_per_hour = price_per_hour;
    }

    public int getPrice_per_hour() {
        return price_per_hour;
    }

    @Override
    public synchronized boolean check_availability() {
        int current_free_slots = Parkinglot.getMax_2wheeler_spots();
        if(current_free_slots <= 0){
            System.out.println("No spots available, check for next available time slot.");
            return false;
        }

        Parkinglot.setMax_2wheeler_spots(current_free_slots--);
        System.out.println("Slot booked for vehicle " + this.getVehicle_name());
        this.setStart_time("current time");

        return true;
    }

    @Override
    public void check_next_available_time() {
           super.check_next_available_time();
    }

    @Override
    public synchronized void free_the_slot() {
        int current_slots = Parkinglot.getMax_2wheeler_spots();
        System.out.println("Freeing this slot");
        Parkinglot.setMax_2wheeler_spots(current_slots++);

    }

    @Override
    public double calculate_price() {
        //calculate the difference between the start time and the current time;
        int time_difference_in_hours = 1;
        return (time_difference_in_hours * this.getPrice_per_hour());
    }
}
