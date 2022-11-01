public class Bus extends Mobil implements Competing {
    String brand;
    String model;
    private double engineVolume;
    private String typeAuto;
    public static final double MAX_SPEED_CAR = 120;

// getters **********************************************************************************************

    public String getBrand() { return brand;
    }
    public String getModel() { return model;
    }
    public double getEngineVolume() { return engineVolume;
    }
    public String getTypeAuto() { return typeAuto;
    }
// setters **********************************************************************************************

    public void setBrand(String brand) {
        this.brand = (brand != null && !brand.isBlank() && !brand.isEmpty()) ? brand : "default";
    }
    public void setModel(String model) {
        this.model = (model != null && !model.isBlank() && !model.isEmpty())? model : "default";
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume != 0 ? engineVolume : 10;
    }

    public void setTypeAuto(String typeAuto) {
        this.typeAuto = (typeAuto!= null && !typeAuto.isBlank() && !typeAuto.isEmpty())? typeAuto : "default";
    }
    // constructor *******************************************************************************************


    public Bus (String typeAuto, String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setTypeAuto(typeAuto);
    }


// methods interfase ********************************************************************

    @Override
    public void startMoving() {
        System.out.println("Start of bus: Снимаем с ручного тормоза, заводим автомобиль, прогреваем, выжимаем сцепление, включаем 1-ю передачу, нажимаем на педаль газа, отпускаем сцепление.");
    }

    @Override
    public void finishMove() {
        System.out.println("Finish of bus: Съезжаем с трассы, отпускаем педаль газа, переключаемся на нейтралку, жмём на тормоз, выключаем двигатель, ставим на ручной тормоз.");
    }

    @Override
    public void pitStop() {
        System.out.println("Пора сменить колёса! Заезжай на Pit Stop.");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время - 50.0 мин." + "\n");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + MAX_SPEED_CAR + " км/ч.");
    }
    @Override
    public String toString() {
        return  this.typeAuto + ": " + this.brand + ", модель - " + this.model + ", V двигателя - " + this.engineVolume + ".";
    }
    public static void printAuto (Bus[] buses) {
        for (Bus el : buses) {
            System.out.println(el);
        }
        System.out.println();
        buses[0].startMoving();
        buses[0].pitStop();
        buses[0].finishMove();
        buses[0].maxSpeed();
        buses[0].bestTime();
    }

} // class **********************************************************************************************************

