public class Car {
    final String brand;
    final String model;
    double engineVolume;
    String color;
    final int productionYear;
    final String productionCountry;
    String transmission;
    final String bodyType;
    String registrationNumber;
    final String numberOfSeats;
    Car(String brand, String model, String productionCountry, double engineVolume, int productionYear, String color,String transmission,String bodyType,String registrationNumber,String numberOfSeats) {

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;

        }
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()){
            this.bodyType = "default";
        }else{
            this.bodyType = bodyType;
        }
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()){
            this.registrationNumber = "default";
        }else{
            this.registrationNumber = registrationNumber;
        }
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "default";
        }else{
            this.transmission = transmission;
        }
        if (numberOfSeats == null || numberOfSeats.isEmpty() || numberOfSeats.isBlank()){
            this.numberOfSeats = "default";
        }else{
            this.numberOfSeats = numberOfSeats;
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

    public String getBodyType() {
        return bodyType;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                " Марка '" + brand + '\'' +
                ", Модель '" + model + '\'' +
                ", Объем двигателя в литрах " + engineVolume +
                ", Цвет кузова '" + color + '\'' +
                ", Год производства " + productionYear +
                ", Страна сборки '" + productionCountry + '\'' +
                ", Коробка передач '" + transmission + '\'' +
                ", Тип кузова '" + bodyType + '\'' +
                ", Регистрационный номер '" + registrationNumber + '\'' +
                ", Количество мест '" + numberOfSeats + '\'' +
                '}';
    }
}
