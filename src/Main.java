public class Main {
    public static void main(String[] args) {
        ModelOfCar bmw5Series = new ModelOfCar("BMW", "5 series");
        ModelOfCar mercedesC63 = new ModelOfCar("Mercedes-Benz", "C63");
        ModelOfCar audiA6 = new ModelOfCar("Audi", "A6");

        EngineOfCar bmw5SeriesBaseEngine = new EngineOfCar("B48B20", 2.0, 249, 9000, 8.0);
        EngineOfCar bmw5SeriesPremiumEngine = new EngineOfCar("B58B30", 3.0, 340, 15000, 12.2);
        EngineOfCar mercedesC63BaseEngine = new EngineOfCar("M139", 2.0, 470, 27000, 9.5);
        EngineOfCar mercedesC63PremiumEngine = new EngineOfCar("M313", 4.0, 592, 35000, 15.2);
        EngineOfCar audiA6BaseEngine = new EngineOfCar("A414B2", 1.8, 220, 10000, 9.9);
        EngineOfCar audiA6PremiumEngine = new EngineOfCar("A612B12", 4.2, 421, 19500, 17.5);

        SalonEquipment bmw5SeriesBaseEquipment = new SalonEquipment("в базовій комплектації", 30000, "МКПП");
        SalonEquipment bmw5SeriesPremiumEquipment = new SalonEquipment("в преміум комплектації", 50000, "АКПП");
        SalonEquipment mercedesC63BaseEquipment = new SalonEquipment("в базовій комплектації", 50000, "АКПП");
        SalonEquipment mercedesC63PremiumEquipment = new SalonEquipment("в преміум комплектації", 70000, "АКПП");
        SalonEquipment audiA6BaseEquipment = new SalonEquipment("в базовій комплектації", 35000, "МКПП");
        SalonEquipment audiA6PremiumEquipment = new SalonEquipment("в мреміум комплектації", 52000, "АКПП");

        double liters = 5.0;

        ModelOfCar.modelInfo(bmw5Series.brand, bmw5Series.model);
        SalonEquipment.salonInfo(bmw5SeriesPremiumEquipment.classOfEquipment, bmw5SeriesPremiumEquipment.transmision, bmw5SeriesPremiumEquipment.fullPriceEquipment(bmw5SeriesPremiumEquipment.priceOfEquipment, bmw5SeriesPremiumEquipment.transmision));
        EngineOfCar.characteristicsOfMotor(bmw5SeriesBaseEngine.modelOfEngine, bmw5SeriesBaseEngine.capacity, bmw5SeriesBaseEngine.horsePower, bmw5SeriesBaseEngine.averageConsumption, bmw5SeriesBaseEngine.enginePrice);
        System.out.printf("Маючи %.1fл пального в баці, ви зможете проїхати %.1f км \n", liters, EngineOfCar.distanceOf10Litres(bmw5SeriesBaseEngine.averageConsumption, liters));
        System.out.printf("Вартість автомобіля - %d$ \n", ModelOfCar.priceOfCar(bmw5SeriesBaseEngine.enginePrice, bmw5SeriesPremiumEquipment.priceOfEquipment));
    }
}