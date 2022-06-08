package ru.skypro;

public abstract class Vehicle implements Transport{

    private final String modelName;
    private final int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void Service(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + modelName);
            for (int i = 0; i < getWheelsCount(); i++) {
                updateTyre();
            }
        }
    }
}
