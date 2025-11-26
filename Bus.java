class Bus extends Vehicle implements PassengerTransport {
    private int passengerCapacity;
    private int currentPassengers = 0;

    public Bus(String licensePlate, String brand, int maxSpeed, int passengerCapacity) {
        super(licensePlate, brand, maxSpeed);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Автобус: " + brand + 
                         ", Номер: " + licensePlate + 
                         ", Макс. скорость: " + maxSpeed + " км/ч" +
                         ", Вместимость: " + passengerCapacity + " пассажиров" +
                         ", Текущее количество: " + currentPassengers + " пассажиров");
    }

    @Override
    public void boardPassengers(int count) {
        if (currentPassengers + count <= passengerCapacity) {
            currentPassengers += count;
            System.out.println("В автобус " + licensePlate + " вошли " + count + " пассажиров. Всего: " + currentPassengers);
        } else {
            System.out.println("Ошибка: Превышена вместимость! Максимум: " + passengerCapacity + ", попытка посадки: " + (currentPassengers + count));
        }
    }

    @Override
    public void disembarkPassengers() {
        System.out.println("Из автобуса " + licensePlate + " вышли " + currentPassengers + " пассажиров");
        currentPassengers = 0;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }
}
