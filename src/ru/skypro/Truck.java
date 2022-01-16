package ru.skypro;

public class Truck extends Machine{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void Service(Transport transport) {
        super.Service(transport);
        checkTrailer();
    }
}
