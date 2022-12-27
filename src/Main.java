public class Main {
    public static void main(String[] args){
        Car lada = new  Car("Lada","Granta","в России",1.7,2015,"желтый");
        Car audi = new  Car("Audi","A8 50 L TDI quattro","в Германии", 3.0,2020,"черный" );
        Car bmv = new  Car("BMW","Z8","в Германии",3.0,2021,"черный");
        Car kia = new  Car("Kia","Sportage 4-го поколения","в Южной Корее",2.4,2018,"красный");
        Car Hyundai = new  Car("Hyundai","Avante","в Южной Корее",1.6,2016,"оранжевый");
        System.out.println(lada);
        System.out.println(audi );
        System.out.println(bmv);
        System.out.println(kia);
        System.out.println(Hyundai);

    }
}