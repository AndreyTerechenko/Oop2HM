public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("LADA", 4);
        Car car2 = new Car("KIA", 4);
        Truck truck1 = new Truck("MAN", 8);
        Truck truck2 = new Truck("DAF", 6);
        Bicycle bicycle1 = new Bicycle("Stels", 2);
        Bicycle bicycle2 = new Bicycle("CUBE", 2);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(truck2, truck1, car1, car2, bicycle1, bicycle2);


    }
}