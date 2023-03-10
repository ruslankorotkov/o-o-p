package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final String numberOfSeats;
    private String tireType;
    private final Key option;

    public static class Key {
        @Override
        public String toString() {
            return "Key{" +
                    " опция 1= '" + remoteEngineStart + '\'' +
                    ", опция 2= '" + keylessEntry + '\'' +
                    '}';
        }

        private final String remoteEngineStart;
        private final String keylessEntry;

        public Key(String remoteEngineStart, String keylessEntry) {
            if (remoteEngineStart == null || remoteEngineStart.isEmpty() || remoteEngineStart.isBlank()) {
                this.remoteEngineStart = "default";
            } else {
                this.remoteEngineStart = "Бесключевой доступ";
            }
            if (keylessEntry == null || keylessEntry.isEmpty() || keylessEntry.isBlank()) {
                this.keylessEntry = "default";
            } else {
                this.keylessEntry = "Удаленный запуск двигателя";
            }
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessEntry() {
            return keylessEntry;
        }
    }

    public Car(String brand, String model, String productionCountry, double engineVolume, int productionYear, String color,
               String transmission, String bodyType, String registrationNumber, String numberOfSeats, String tireType, Key option) {

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
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (numberOfSeats == null || numberOfSeats.isEmpty() || numberOfSeats.isBlank()) {
            this.numberOfSeats = "default";
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (LocalDate.now().getMonthValue() > 3 && LocalDate.now().getMonthValue() < 11) {
            this.tireType = " Летняя резина ";
        } else {
            this.tireType = " Зимняя резина ";
        }
        this.option = option;
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

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public String getTireType() {
        return tireType;
    }

    public Key getOption() {
        return this.option;
    }

    @Override
    public String toString() {
        return " Автомобиль {" +
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
                ", Покрышки '" + tireType + '\'' +
                ", Ключ " + option +
                '}';

    }
}


