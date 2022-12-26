public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Car(String brand, String model, String productionCountry, double engineVolume, int productionYear, String color) {

        if (brand == null || brand == "") {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model == "") {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionCountry == null || productionCountry == "") {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (color == null || color == "") {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;

        }
    }

    public String getBrand() {
        return brand;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getModel() {
        return model;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "бренд'" + brand + '\'' +
                ", модель'" + model + '\'' +
                ", объем двигателя в литрах " + engineVolume +
                ", цвет кузова '" + color + '\'' +
                ", год производства  " + productionYear +
                ", сборка'" + productionCountry + '\'' +
                '}';

    }
}
