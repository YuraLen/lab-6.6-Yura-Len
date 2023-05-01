public class Main {
    public static void main(String[] args) {
        EngineOfCar mazda6BaseEngine = new EngineOfCar("22f3", 2.0);
        System.out.printf("Модель мотору %s. Об'м %.1f. %d кінських сил. Ціна мотору: %.2f$. Сер.розхід: %.1fкм/100л.\n",
                mazda6BaseEngine.modelOfEngine, mazda6BaseEngine.capacity, mazda6BaseEngine.horsePower,
                mazda6BaseEngine.enginePrice, mazda6BaseEngine.averageConsumption);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        ModelOfCar bmw5Series = new ModelOfCar("BMW", "5 series");
        ModelOfCar mercedesC63 = new ModelOfCar("Mercedes-Benz", "C63");
        ModelOfCar audiA6 = new ModelOfCar("Audi", "A6");

        ModelOfCar toyotaCamry = new ModelOfCar("Toyota", "Camry");
        System.out.println("Країна виробник: " + toyotaCamry.producingCountry);

        SalonEquipment toyotaCamryBaseEquipment = new SalonEquipment("в базовій комплектації", 3400);

        EngineOfCar toyotaCamryBaseEngine = new EngineOfCar("2F21", 1.8, 150, 7580);
        System.out.printf("Вартість мотору %.2f$ та середній розхід %.1fл/100км.\n", toyotaCamryBaseEngine.enginePrice, toyotaCamryBaseEngine.averageConsumption);

        SalonEquipment bmw5sa = new SalonEquipment("В базовй комплектації", 2000);
        System.out.println(bmw5sa.transmision);

        EngineOfCar bmw5en = new EngineOfCar("sfq", 3.8, 440); // приклад підрахунку вартості мотору

        EngineOfCar bmw5SeriesBaseEngine = new EngineOfCar("B48B20", 2.0, 249, 9000.50, 8.8);
        EngineOfCar bmw5SeriesPremiumEngine = new EngineOfCar("B58B30", 3.0, 340, 15230.20, 12.2);
        EngineOfCar mercedesC63BaseEngine = new EngineOfCar("M139", 2.0, 470, 27000.50, 9.5);
        EngineOfCar mercedesC63PremiumEngine = new EngineOfCar("M313", 4.0, 592, 35000.80, 15.2);
        EngineOfCar audiA6BaseEngine = new EngineOfCar("A414B2", 1.8, 220, 11200.60, 9.9);
        EngineOfCar audiA6PremiumEngine = new EngineOfCar("A612B12", 4.2, 421, 19500.20, 17.5);

        SalonEquipment bmw5SeriesBaseEquipment = new SalonEquipment("в базовій комплектації", 30000, "МКПП");
        SalonEquipment bmw5SeriesPremiumEquipment = new SalonEquipment("в преміум комплектації", 50000, "АКПП");
        SalonEquipment mercedesC63BaseEquipment = new SalonEquipment("в базовій комплектації", 50000, "АКПП");
        SalonEquipment mercedesC63PremiumEquipment = new SalonEquipment("в преміум комплектації", 70000, "АКПП");
        SalonEquipment audiA6BaseEquipment = new SalonEquipment("в базовій комплектації", 35000, "МКПП");
        SalonEquipment audiA6PremiumEquipment = new SalonEquipment("в мреміум комплектації", 52000, "АКПП");

        double dliters = 5.0; // кількість літрів в баку (double num)
        int iliters = 5;      // кількість літрів в баку (int num)

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        ModelOfCar.modelInfo(bmw5Series.brand, bmw5Series.model);
        SalonEquipment.salonInfo(bmw5SeriesPremiumEquipment.classOfEquipment, bmw5SeriesPremiumEquipment.transmision, bmw5SeriesPremiumEquipment.fullPriceEquipment(bmw5SeriesPremiumEquipment.priceOfEquipment, bmw5SeriesPremiumEquipment.transmision));
        EngineOfCar.characteristicsOfMotor(bmw5SeriesBaseEngine.modelOfEngine, bmw5SeriesBaseEngine.capacity, bmw5SeriesBaseEngine.horsePower, bmw5SeriesBaseEngine.averageConsumption, bmw5SeriesBaseEngine.enginePrice);

//        System.out.printf("Маючи %.1fл пального в баці, ви зможете проїхати %.1f км \n", dliters, EngineOfCar.distanceOf10Litres(bmw5SeriesBaseEngine.averageConsumption, dliters));
        System.out.printf("Маючи %d пального в баці, ви зможете проїхати %d км \n", iliters, Math.round(EngineOfCar.distanceOf10Litres(bmw5SeriesBaseEngine.averageConsumption, iliters)));

        System.out.printf("Вартість автомобіля - %d$ \n", Math.round(ModelOfCar.priceOfCar(bmw5SeriesBaseEngine.enginePrice, bmw5SeriesPremiumEquipment.priceOfEquipment)));
//        System.out.printf("Вартість автомобіля - %.2f$ \n", ModelOfCar.priceOfCar(bmw5SeriesBaseEngine.enginePrice, bmw5SeriesPremiumEquipment.priceOfEquipment));
    }
}