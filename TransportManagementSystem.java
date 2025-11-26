public class TransportManagementSystem {
    public static void main(String[] args) {
        // Создаем транспортную компанию
        TransportCompany company = new TransportCompany();

        // Создаем различные транспортные средства
        Truck truck1 = new Truck("А123БВ", "Volvo", 120, 20.0);
        Truck truck2 = new Truck("В456ГД", "MAN", 110, 15.0);
        
        Bus bus1 = new Bus("Е789ЖЗ", "Mercedes", 100, 50);
        Bus bus2 = new Bus("И012КЛ", "Scania", 95, 40);
        
        Minivan minivan1 = new Minivan("М345НП", "Ford", 130, 1.5, 8);
        Minivan minivan2 = new Minivan("Р678СТ", "Volkswagen", 125, 1.0, 7);

        // Добавляем транспортные средства в парк
        company.addVehicle(truck1);
        company.addVehicle(truck2);
        company.addVehicle(bus1);
        company.addVehicle(bus2);
        company.addVehicle(minivan1);
        company.addVehicle(minivan2);

        // Демонстрируем работу системы
        company.displayAllVehicles();
        
        // Демонстрируем полиморфизм
        company.demonstratePolymorphism();
        
        // Проводим погрузку
        company.loadAllCargo();
        
        // Демонстрируем посадку пассажиров
        System.out.println("=== ПОСАДКА ПАССАЖИРОВ ===");
        for (Vehicle vehicle : company.vehicleFleet) {
            if (vehicle instanceof PassengerTransport) {
                PassengerTransport passengerVehicle = (PassengerTransport) vehicle;
                int passengers = (int)(Math.random() * 10 + 5); // от 5 до 15 пассажиров
                passengerVehicle.boardPassengers(passengers);
            }
        }
        
        // Показываем обновленную информацию
        company.displayAllVehicles();
        
        // Проводим техническое обслуживание
        company.performMaintenance();
        
        // Демонстрируем разгрузку и высадку пассажиров
        System.out.println("=== РАЗГРУЗКА И ВЫСАДКА ===");
        for (Vehicle vehicle : company.vehicleFleet) {
            if (vehicle instanceof CargoTransport) {
                ((CargoTransport) vehicle).unloadCargo();
            }
            if (vehicle instanceof PassengerTransport) {
                ((PassengerTransport) vehicle).disembarkPassengers();
            }
        }
        
        // Финальный просмотр состояния парка
        company.displayAllVehicles();
    }
}
