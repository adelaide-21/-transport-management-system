class Truck extends Vehicle implements CargoTransport {
    private double cargoCapacity;
    private double currentCargo = 0;

    public Truck(String licensePlate, String brand, int maxSpeed, double cargoCapacity) {
        super(licensePlate, brand, maxSpeed);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Грузовик: " + brand + 
                         ", Номер: " + licensePlate + 
                         ", Макс. скорость: " + maxSpeed + " км/ч" +
                         ", Грузоподъемность: " + cargoCapacity + " т" +
                         ", Текущий груз: " + currentCargo + " т");
    }

    @Override
    public void loadCargo(double weight) {
        if (currentCargo + weight <= cargoCapacity) {
            currentCargo += weight;
            System.out.println("Грузовик " + licensePlate + " загружен на " + weight + " т. Текущий груз: " + currentCargo + " т");
        } else {
            System.out.println("Ошибка: Превышена грузоподъемность! Максимум: " + cargoCapacity + " т, попытка загрузки: " + (currentCargo + weight) + " т");
        }
    }

    @Override
    public void unloadCargo() {
        System.out.println("Грузовик " + licensePlate + " разгружен. Выгружено: " + currentCargo + " т");
        currentCargo = 0;
    }
}
