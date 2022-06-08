package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle("bicycle1");
        Bicycle bicycle2 = new Bicycle("bicycle2");
        Car car = new Car("car1");
        Car car2 = new Car("car2");
        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Transport[] transports = {car, car2, bicycle, bicycle2, truck, truck2};
        ServiceStation station = new ServiceStation();

        for (Transport transport : transports) {
            station.check(transport);
        }
    }
}
