import java.util.Objects;

public class Car extends Mobil implements Competing{

    private String brand;
    private String model;
    private double engineVolume;
    private String typeAuto;
    public static final double MAX_SPEED_CAR = 250;

    private TypeBodyCar typeBodyCar;

// ENUM ********************************************************************************
    public enum TypeBodyCar {
        SEDAN("Седан"),
        HUNCHBOOK("Хетчбек"),
        COUPE("Купе"),
        STATE("Универсал"),
        OFF_ROAD("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String typeBody;

        TypeBodyCar(String typeBody) {
            this.typeBody = typeBody != null && !typeBody.isBlank() ? typeBody : "Данных недостаточно";
        }

        public String getTypeBody() { return typeBody;
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

    public TypeBodyCar getTypeBodyCar() { return typeBodyCar;
    }
    //    public void getTypeBody() {
//        if (this.typeBody != null) {
//            System.out.println(getBrand()+" "+getModel()+" is a " + getTypeBody());
//        } else {
//            System.out.println("Not enough data");
//        }
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

    public void setTypeBodyCar(TypeBodyCar typeBodyCar) {
        this.typeBodyCar = typeBodyCar;
    }

    // constructor *******************************************************************************************


    public Car (String typeAuto, String brand, String model, double engineVolume, TypeBodyCar typeBodyCar) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setTypeAuto(typeAuto);
        setTypeBodyCar(typeBodyCar);
    }


// methods interfase ********************************************************************

    @Override
    public void startMoving() {
        System.out.println("Start of car: Снимаем с ручного тормоза, заводим автомобиль, прогреваем, выжимаем сцепление, включаем 1-ю передачу, нажимаем на педаль газа, отпускаем сцепление.");
    }

    @Override
    public void finishMove() {
        System.out.println("Finish of car: Съезжаем с трассы, отпускаем педаль газа, переключаемся на нейтралку, жмём на тормоз, выключаем двигатель, ставим на ручной тормоз.");
    }

    @Override
    public void pitStop() {
        System.out.println("Pit Stop: Пора сменить колёса! Заезжай в Автосервис.");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время - 24.0 мин." + "\n");


    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + MAX_SPEED_CAR + " км/ч.");

    }
    public static void printAuto (Car[] cars) {
        for (Car el : cars) {
            System.out.println(el);
        }
        System.out.println();
        cars[0].startMoving();
        cars[0].pitStop();
        cars[0].finishMove();
        cars[0].maxSpeed();
        cars[0].bestTime();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car cars = (Car) o;
        return Double.compare(cars.engineVolume, engineVolume) == 0
                && Objects.equals(brand, cars.brand) && Objects.equals(model, cars.model)
                && Objects.equals(typeAuto, cars.typeAuto);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, typeAuto);
    }
    @Override
    public String toString() {
        return  this.typeAuto + ": " + this.brand + ", модель - " + this.model
                + ", V двигателя - " + this.engineVolume + ", тип кузова - " + typeBodyCar.getTypeBody() + ".";
    }
} // class **********************************************************************************************************


