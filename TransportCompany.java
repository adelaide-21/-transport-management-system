class TransportCompany {
    private List<Vehicle> vehicleFleet;

    public TransportCompany() {
        this.vehicleFleet = new ArrayList<>();
    }

    // Добавление транспортного средства в парк
    public void addVehicle(Vehicle vehicle) {
        vehicleFleet.add(vehicle);
        System.out.println("Транспортное средство " + vehicle.getLicensePlate() + " добавлено в парк");
    }

    // Вывод информации о всех транспортных средствах
    public void displayAllVehicles() {
        System.out.println("\n=== ВЕСЬ ПАРК ТРАНСПОРТНЫХ СРЕДСТВ ===");
        for (Vehicle vehicle : vehicleFleet) {
            vehicle.displayInfo();
        }
        System.out.println("====================================\n");
    }
