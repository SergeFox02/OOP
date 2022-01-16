package ru.skypro;

public abstract class Machine extends Vehicle{

    public Machine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void Service(Transport transport) {
        super.Service(transport);
        checkEngine();
    }
}
