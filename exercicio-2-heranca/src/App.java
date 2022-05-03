public class App {
  public static void main(String[] args) throws Exception {
    // seting the car attributes
    Vehicle car = new Vehicle();
    car.setModel("celta");
    car.setManufacturer("Chevrolet");
    car.setPlate("ABC-0123");
    car.setYear(2003);
    car.setChassis(1);

    ChargeVehicle chargeCar = new ChargeVehicle();
    chargeCar.setModel("XLS-125");
    chargeCar.setManufacturer("Volvo");
    chargeCar.setPlate("CBA-5432");
    chargeCar.setYear(2005);
    chargeCar.setChassis(1);
    // unique attribute in KGS
    chargeCar.setChargeCapacity(800);

    PassengerVehicle passegerCar = new PassengerVehicle();
    passegerCar.setModel("HB20");
    passegerCar.setManufacturer("Hyunday");
    passegerCar.setPlate("ZXC-0981");
    passegerCar.setYear(2018);
    passegerCar.setChassis(1);
    // unique attributes of passengerCar
    passegerCar.setDoorsNumber(4);
    passegerCar.setHasAir(true);

    System.out.println("THE SIMPLE CAR");
    System.out.println("Model: " + car.getModel());
    System.out.println("Manufacturer: " + car.getManufacturer());
    System.out.println("Plate: " + car.getPlate());
    System.out.println("Year: " + car.getYear());
    System.out.println("Chassis: " + car.getChassis());

    System.out.println("===================");
    System.out.println("THE CHARGE CAR");
    System.out.println("Model: " + chargeCar.getModel());
    System.out.println("Manufacturer: " + chargeCar.getManufacturer());
    System.out.println("Plate: " + chargeCar.getPlate());
    System.out.println("Year: " + chargeCar.getYear());
    System.out.println("Chassis: " + chargeCar.getChassis());
    System.out.println("Charge Capacity: " + chargeCar.getChargeCapacity());

    System.out.println("===================");
    System.out.println("THE PASSENGER CAR");
    System.out.println("Model: " + passegerCar.getModel());
    System.out.println("Manufacturer: " + passegerCar.getManufacturer());
    System.out.println("Plate: " + passegerCar.getPlate());
    System.out.println("Year: " + passegerCar.getYear());
    System.out.println("Chassis: " + passegerCar.getChassis());
    System.out.println("Doors Number: " + passegerCar.getDoorsNumber());
    System.out.println("Has Air: " + passegerCar.getHasAir());

  }
}
