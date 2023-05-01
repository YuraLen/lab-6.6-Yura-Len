import javax.management.BadBinaryOpValueExpException;
import java.util.EmptyStackException;

public class EngineOfCar {
    static String modelOfEngine;
    static double capacity; // об'єм мотору
    int horsePower; // кінські сили
    double enginePrice;
    double averageConsumption; // середній розхід

    public EngineOfCar(String modelOfEngine, double capacity, int horsePower, double enginePrice, double averageConsumption){
        this.modelOfEngine = modelOfEngine;
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.enginePrice = enginePrice;
        this.averageConsumption = averageConsumption;
    }

    public EngineOfCar(String modelOfEngine, double capacity, int horsePower, double enginePrice){
        this.modelOfEngine = modelOfEngine;
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.enginePrice = enginePrice;
        averageConsumption = capacity * 4;
    }

    public EngineOfCar(String modelOfEngine, double capacity, int horsePower){
        this.modelOfEngine = modelOfEngine;
        this.capacity = capacity;
        this.horsePower = horsePower;
        if (capacity >= 2.0 && capacity < 2.5){
            enginePrice = 3000;
            averageConsumption = 7.5;
        } else if (capacity >= 2.5 && capacity < 3.0) {
            enginePrice = 5000;
            averageConsumption = 12.2;
        } else if (capacity >= 3.0 && capacity < 4.0) {
            enginePrice = 9000;
            averageConsumption = 15.8;
        } else {
            enginePrice = 0;
            averageConsumption = 0;
        }
    }

    public EngineOfCar(String modelOfEngine, double capacity){
        this.modelOfEngine = modelOfEngine;
        this.capacity = capacity;
        horsePower = (int)capacity * 80;
        if (capacity >= 2.0 && capacity < 2.5){
            enginePrice = 3000;
            averageConsumption = 7.5;
        } else if (capacity >= 2.5 && capacity < 3.0) {
            enginePrice = 5000;
            averageConsumption = 12.2;
        } else if (capacity >= 3.0 && capacity < 4.0) {
            enginePrice = 9000;
            averageConsumption = 15.8;
        } else {
            enginePrice = 0;
            averageConsumption = 0;
        }
        averageConsumption = capacity * 4;
    }

    static double distanceOf10Litres(double averageConsumption ,double liters){
        double result;
        result = (liters / averageConsumption) * 100;
        return result;
    }

    int distanceOf10Litres(int averageConsumptionm, int liters){
        int result;
        result = Math.round((liters/averageConsumptionm) * 100);
        return result;
    }

    static void characteristicsOfMotor(String modelOfEngine, double capacity, int horsePower, double averageConsumption, double enginePrice){
        System.out.println("    ~-~ Характеристики мотору ~-~   ");
        System.out.printf("Модель мотору - %s. Об'єм %.1f та %d кінських сил. Середній розхід %.1fл/100км. Ціна двигуна %.2f$.\n", modelOfEngine, capacity, horsePower, averageConsumption, enginePrice);
    }
}
