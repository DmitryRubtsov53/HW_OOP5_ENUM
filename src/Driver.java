import java.util.Objects;

public class Driver <D extends Mobil & Competing> {
    private String fullName;
    private String license;  // права - лицензии
    private int experience;  // стаж водителя

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = (fullName != null && !fullName.isEmpty() && !fullName.isBlank()) ? fullName : "Incognito";
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = (license != null && !license.isEmpty() && !license.isBlank()) ? license : "B";
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience != 0 ? experience : 2;
    }

    public Driver(String fullName, String license, int experience) {
        setFullName(fullName);
        setLicense(license);
        setExperience(experience);
    }

    // methods ***************************************************************************
    public void driveCar(Car cars) {
        System.out.println("автомобиле " + cars.getBrand() + " " + cars.getModel() + ".");
    }
    public void driveTruck(Truck trucks) {
        System.out.println("грузовике " + trucks.getBrand() + " " + trucks.getModel() + ".");
    }
    public void driveBus(Bus buses) {
        System.out.println("автобусе " + buses.getBrand() + " " + buses.getModel() + ".");
    }

    public static void refuelAuto() {
        System.out.println("Пополняем запас топрива в баке.");
    }

    public void startD() {
        System.out.println("Start: Снимаем с ручного тормоза, заводим, прогреваем, выжимаем сцепление, включаем 1-ю передачу, нажимаем на педаль газа, отпускаем сцепление.");
    }
    public void finishD() {
        System.out.println("Finish: Съезжаем с трассы, отпускаем педаль газа, переключаемся на нейтралку, жмём на тормоз, выключаем двигатель, ставим на ручной тормоз.");
    }
    //*********************************************************************************************************************
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return experience == driver.experience
                && Objects.equals(fullName, driver.fullName) && Objects.equals(license, driver.license);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, license, experience);
    }

    @Override
    public String toString() {
        return "Водитель " + fullName + " (права категории " + license + ") будет участвовать в гонках на ";
    }
} // class ************************************************************************************************************

