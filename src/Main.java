public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание ООП4 Автогонки ********************************************************");
        System.out.println();

        Car[] cars = new Car [4];
        cars[0] = new Car("Car", "Audi", "A8 50L", 4.1);
        cars[1] = new Car("Car", "BMW", "Z05", 3.5);
        cars[2] = new Car("Car", "Hyundai", "i70L", 3.7);
        cars[3] = new Car("Car", "Kia", "Sport", 4.0);

        Car.printAuto(cars);

        Truck[] trucks = new Truck [4];
        trucks[0] = new Truck("Truck", "КаМАЗ", "К850", 10.5);
        trucks[1] = new Truck("Truck", "МАЗ>", "A650", 10.5);
        trucks[2] = new Truck("Truck", "КрАЗ", "М1020", 12);
        trucks[3] = new Truck("Truck", "ГАЗ", "1301", 8.5);

        Truck.printAuto(trucks);

        Bus[] buses = new Bus [4];
        buses[0] = new Bus("Bus", "НефАЗ", "Н456", 8.5);
        buses[1] = new Bus("Bus", "ПАЗ", "П587", 9);
        buses[2] = new Bus("Bus", "ЛиАЗ", "Л110", 10);
        buses[3] = new Bus("Bus", "ГАЗ", "Б1500", 9.5);

        Bus.printAuto(buses);

        Driver [] drivers = new Driver[3];

        Driver <Car> ivan = new Driver<>("Иван", "B", 10 );
        System.out.print(ivan);
        ivan.driveCar(cars[0]);

        Driver <Truck> svan = new Driver<>("Сван", "C", 7 );
        System.out.print(svan);
        svan.driveTruck(trucks[0]);

        Driver <Bus> semen = new Driver<>("Семён", "D", 15 );
        System.out.print(semen);
        semen.driveBus(buses[0]);

    } // main ********************************************************************************************


} // class Main ******************************************************************************************