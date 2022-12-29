import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", "в России", 1.7, 2015, "желтый", "автоматика", "седан", "5а6а54", "3","",key);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", "в Германии", 3.0, 2020, "черный", "автоматика", "универсал", "ве5уе5","5","",key);
        Car bmv = new Car("BMW", "Z8", "в Германии", 3.0, 2021, "черный", "механика", "минивэн", "в4веее", "3","",key);
        Car kia = new Car("Kia", "Sportage 4-го поколения", "в Южной Корее", 2.4, 2018, "красный", "механика", "хэтчбек", "ев4ев4в4", "4","",key);
        Car Hyundai = new Car("Hyundai", "Avante", "в Южной Корее", 1.6, 2016, "оранжевый", "автоматика", "кроссовер", "ве4еву", "4","",key);
        Key key = new Key("gdvv","cttdd");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmv);
        System.out.println(kia);
        System.out.println(Hyundai);

    }
}
