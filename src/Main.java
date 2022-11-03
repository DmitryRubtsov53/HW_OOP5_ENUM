public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание ООП4 Автогонки ********************************************************");
        System.out.println();

        Car[] cars = new Car [4];
        cars[0] = new Car("Car", "Audi", "A8 50L", 4.1, Car.TypeBodyCar.SEDAN);
        cars[1] = new Car("Car", "BMW", "Z05", 3.5, Car.TypeBodyCar.HUNCHBOOK);
        cars[2] = new Car("Car", "Hyundai", "i70L", 3.7, Car.TypeBodyCar.VAN);
        cars[3] = new Car("Car", "Kia", "Sport", 4.0, Car.TypeBodyCar.PICKUP);

        //Car.printAuto(cars);

        Truck[] trucks = new Truck [4];
        trucks[0] = new Truck("Truck", "КаМАЗ", "К850", 10.5, Truck.TruckCapacity.N3);
        trucks[1] = new Truck("Truck", "МАЗ", "A650", 10.5,null);
        trucks[2] = new Truck("Truck", "КрАЗ", "М1020", 12,Truck.TruckCapacity.N3);
        trucks[3] = new Truck("Truck", "ГАЗ", "1301", 8.5,Truck.TruckCapacity.N2);

        //Truck.printAuto(trucks);

        Bus[] buses = new Bus [4];
        buses[0] = new Bus("Bus", "НефАЗ", "Н456", 8.5, Bus.BusCapacity.BIG);
        buses[1] = new Bus("Bus", "ПАЗ", "П587", 9, Bus.BusCapacity.AVEREGE);
        buses[2] = new Bus("Bus", "ЛиАЗ", "Л110", 10, Bus.BusCapacity.AVEREGE);
        buses[3] = new Bus("Bus", "ГАЗ", "Б1500", 9.5, Bus.BusCapacity.SMOLL);

        buses[3].setBusCapacity(Bus.BusCapacity.BIG);

        //Bus.printAuto(buses);

        Driver <Car> ivan = new Driver<>("Иван", "B", 10 );
        System.out.print(ivan);
        ivan.driveCar(cars[0]);

        Driver <Truck> svan = new Driver<>("Сван", "C", 7 );
        System.out.print(svan);
        svan.driveTruck(trucks[0]);

        Driver <Bus> semen = new Driver<>("Семён", "D", 15 );
        System.out.print(semen);
        semen.driveBus(buses[0]);

        System.out.println();

        cars[1].printType();
        trucks[1].printType();
        buses[1].printType();


    } // main


} // class Main