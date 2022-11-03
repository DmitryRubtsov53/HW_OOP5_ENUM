public class Truck extends Mobil implements Competing{
    private String brand;
    private String model;
    private double engineVolume;
    private String typeAuto;
    public static final double MAX_SPEED_CAR = 170;

    private TruckCapacity truckCapacity;

// ENUM ********************************************************************************
    public enum TruckCapacity {
        N1 ("N1(с полной массой до 3,5 тонн)"),
        N2("N2 (с полной массой свыше 3,5 до 12 тонн)"),
        N3("N3 (с полной массой свыше 12 тонн)");

        private final String tonnage;

        TruckCapacity(String tonnage) {
          this.tonnage = tonnage != null & !tonnage.isBlank() ? tonnage : "Данных недостаточно" ;
        }
        public String getTonnage() { return tonnage;
        }
}
// getters **********************************************************************************************

    public String getBrand() { return brand;
    }
    public String getModel() { return model;
    }
    public double getEngineVolume() { return engineVolume;
    }
    public String getTypeAuto() { return typeAuto;
    }

    public TruckCapacity getTruckCapacity() { return truckCapacity;
    }
    // setters **********************************************************************************************

    public void setBrand(String brand) {
        this.brand = (brand != null && !brand.isBlank()) ? brand : "default";
    }
    public void setModel(String model) {
        this.model = (model != null && !model.isBlank())? model : "default";
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume != 0 ? engineVolume : 10;
    }

    public void setTypeAuto(String typeAuto) {
        this.typeAuto = (typeAuto!= null && !typeAuto.isBlank())? typeAuto : "default";
    }

    public void setTruckCapacity(TruckCapacity truckCapacity) {
        this.truckCapacity = truckCapacity;
    }
    // constructor *******************************************************************************************

    public Truck (String typeAuto, String brand, String model, double engineVolume, TruckCapacity truckCapacity) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setTypeAuto(typeAuto);
        setTruckCapacity(truckCapacity);
    }

// methods interfase ********************************************************************

    @Override
    public void startMoving() {
        System.out.println("Start of truck: Снимаем с ручного тормоза, заводим автомобиль, прогреваем, выжимаем сцепление, включаем 1-ю передачу, нажимаем на педаль газа, отпускаем сцепление.");
    }

    @Override
    public void finishMove() {
        System.out.println("Finish of truck: Съезжаем с трассы, отпускаем педаль газа, переключаемся на нейтралку, жмём на тормоз, выключаем двигатель, ставим на ручной тормоз.");
    }

    @Override
    public void printType() {
        if (truckCapacity == null) {
            System.out.println("Данных недостатчно");
        } else System.out.println("Грузовик "+ getBrand() + " " + getModel() +" имеет грузоподъёмность " + truckCapacity.getTonnage() + ".");
    }

    @Override
    public void pitStop() {
        System.out.println("Пора сменить колёса! Заезжай на Pit Stop.");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время - 35.29 мин." + "\n");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + MAX_SPEED_CAR + " км/ч.");
    }


    @Override
    public String toString() {
        return  this.typeAuto + ": " + this.brand + ", модель - " + this.model
                + ", V двигателя - " + this.engineVolume + ", грузоподъемность " + truckCapacity.getTonnage() + ".";
    }
    public static void printAuto (Truck[] trucks) {
        for (Truck el : trucks) {
            System.out.println(el);
        }
        System.out.println();
        trucks[0].startMoving();
        trucks[0].pitStop();
        trucks[0].finishMove();
        trucks[0].maxSpeed();
        trucks[0].bestTime();
    }
} // class **********************************************************************************************************

