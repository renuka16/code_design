public class Parkinglot {
    private static int max_2wheeler_spots = 10;
    private static int max_4wheeler_spots = 5;
    private String name;

    public Parkinglot(String name) {
        this.name = name;
    }

    public static int getMax_2wheeler_spots() {
        return max_2wheeler_spots;
    }

    public static void setMax_2wheeler_spots(int max_2wheeler_spots) {
        Parkinglot.max_2wheeler_spots = max_2wheeler_spots;
    }

    public static int getMax_4wheeler_spots() {
        return max_4wheeler_spots;
    }

    public static void setMax_4wheeler_spots(int max_4wheeler_spots) {
        Parkinglot.max_4wheeler_spots = max_4wheeler_spots;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void grant_slot(Vehicle obj){
        if(!obj.check_availability()){
            System.out.println("No free slot available, check later\n");
            return;
        }

        System.out.println("Slot allotted successfully for " + obj.getVehicle_name());
    }


    public void close_slot(Vehicle obj){
        System.out.println("The total price is "+ obj.calculate_price());
        obj.free_the_slot();
        return;
    }
}
