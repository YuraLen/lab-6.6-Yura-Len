public class ModelOfCar {
    String brand;
    String model;
    String producingCountry;

    public ModelOfCar(String brand, String model, String producingCountry){
        this.brand = brand;
        this.model = model;
        this.producingCountry = producingCountry;
    }

    public ModelOfCar(String brand, String model){
        this.brand = brand;
        this.model = model;
        if (brand.equalsIgnoreCase("bmw") || brand.equalsIgnoreCase("Mercedes-Benz") || brand.equalsIgnoreCase("audi")) {
            producingCountry = "Німеччина";
        } else if (brand.equalsIgnoreCase("Toyota")) {
            producingCountry = "Японія";
        }
    }


    static void modelInfo(String brand, String model){
        System.out.printf("Марка автомобіля - %s. Модель - %s\n", brand, model);
    }

    static double priceOfCar(double a, double b) { return a + b; }

    static int priceOfCar(int a, int b){
        return a + b;
    }
}
