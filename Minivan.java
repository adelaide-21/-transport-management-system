class Minivan extends Vehicle implements CargoTransport, PassengerTransport {
    private double cargoCapacity;
    private int passengerCapacity;
    private double currentCargo = 0;
    private int currentPassengers = 0;

    public Minivan(String licensePlate, String brand, int maxSpeed, double cargoCapacity, int passengerCapacity) {
        super(licensePlate, brand, maxSpeed);
        this.cargoCapacity = cargoCapacity;
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Минивэн: " + brand + 
                         ", Номер: " + licensePlate + 
                         ", Макс. скорость: " + maxSpeed + " км/ч" +
                         ", Грузоподъемность: " + cargoCapacity + " т" +
                         ", Текущий груз: " + currentCargo + " т" +
                         ", Вместимость: " + passengerCapacity + " пассажиров" +
                         ", Текущее количество: " + currentPassengers + " пассажиров");
    }

    @Override
    public void loadCargo(double weight) {
        if (currentCargo + weight <= cargoCapacity) {
            currentCargo += weight;
            System.out.println("Минивэн " + licensePlate + " загружен на " + weight + " т. Текущий груз: " + currentCargo + " т");
        } else {
            System.out.println("Ошибка: Превышена грузоподъемность минивэна! Максимум: " + cargoCapacity + " т, попытка загрузки: " + (currentCargo + weight) + " т");
        }
    }

    @Override
    public void unloadCargo() {
        System.out.println("Минивэн " + licensePlate + " разгружен. Выгружено: " + currentCargo + " т");
        currentCargo = 0;
    }

    @Override
    public void boardPassengers(int count) {
        if (currentPassengers + count <= passengerCapacity) {
            currentPassengers += count;
            System.out.println("В минивэн " + licensePlate + " вошли " + count + " пассажиров. Всего: " + currentPassengers);
        } else {
            System.out.println("Ошибка: Превышена вместимость минивэна! Максимум: " + passengerCapacity + ", попытка посадки: " + (currentPassengers + count));
        }
    }

    @Override
    public void disembarkPassengers() {
        System.out.println("Из минивэна " + licensePlate + " вышли " + currentPassengers + " пассажиров");
        currentPassengers = 0;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public double getCurrentCargo() {
        return currentCargo;
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }
}
