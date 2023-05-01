public class SalonEquipment {
    String classOfEquipment;
    double priceOfEquipment;
    String transmision;

    public SalonEquipment(String classOfEquipment, double priceOfEquipment, String transmision){
        this.classOfEquipment = classOfEquipment;
        this.priceOfEquipment = priceOfEquipment;
        this.transmision = transmision;
    }

    public SalonEquipment(String classOfEquipment, double priceOfEquipment){
        this.classOfEquipment = classOfEquipment;
        this.priceOfEquipment = priceOfEquipment;
        if (classOfEquipment.equalsIgnoreCase("в базовій комплектації")){
            transmision = "МКПП";
        } else {
            transmision = "АКПП";
        }
    }

    double fullPriceEquipment(double priceOfEquipment, String transmision){
        if (transmision.equalsIgnoreCase("МКПП")) {
            return priceOfEquipment + 1000;
        } else if (transmision.equalsIgnoreCase("АКПП")) {
            return priceOfEquipment + 3000;
        } return priceOfEquipment;
    }

    static void salonInfo(String classOfEquipment, String transmision, double fullPriceEquipment){
        System.out.printf("Автомобіль %s та на %s. Вартість комплектації - %.2f$.\n", classOfEquipment, transmision, fullPriceEquipment);
    }
}
