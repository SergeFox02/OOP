package ru.skypro;

public class ServiceStation {

    public void chek(Bicycle bicycle){
        if (bicycle != null) {
            chekTyre(bicycle);
        }
    }

    public void chek(Car car){
        if (car != null) {
            chekTyre(car);
            car.checkEngine();
        }
    }

    public void chek(Truck truck) {
        if (truck != null) {
            chekTyre(truck);
            truck.checkEngine();
            truck.checkTrailer();
        }
    }

    private void chekTyre(Bicycle bicycle){
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }

}
