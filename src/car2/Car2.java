package car2;

public class Car2 {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car2(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;


        System.out.println(brand + " " + model + " " + engineVolume + " " +
                " литра," + " " + color + " " + productionYear + " " + productionCountry);

    }

    public Car2(String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == null) {
            this.brand = "default";
        }
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;


        System.out.println(brand + " " + model + " " + engineVolume + " " +
                " литра," + " " + color + " " + productionYear + " " + productionCountry);
    }

    public Car2(String brand, double engineVolume, String color, int productionYear) {
        this.brand = brand;
        if (model == null) {
            this.model = "default";
        }
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;


        System.out.println(brand + " " + model + " " + engineVolume + " " +
                " литра," + " " + color + " " + productionYear + " " + productionCountry);
    }

    public Car2(String brand, String color, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        if (productionCountry == null) {
            this.productionCountry = "default";
        }


        System.out.println(brand + " " + model + " " + engineVolume + " " +
                " литра," + " " + color + " " + productionYear + " " + productionCountry);
    }

    public Car2(String brand, String model, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        }
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;


        System.out.println(brand + " " + model + " " + engineVolume + " " +
                " литра," + " " + color + " " + productionYear + " " + productionCountry);
    }

    public Car2(String brand, String model, double engineVolume, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        if (color == null) {
            this.color = "белый";
        }
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;


        System.out.println(brand + " " + model + " " + engineVolume + " " +
                " литра," + " " + color + " " + productionYear + " " + productionCountry);

    }

    public Car2(String brand, String model, double engineVolume, String color, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        if (productionYear == 0) {
            this.productionYear = 2000;
        }
        this.productionCountry = productionCountry;


        System.out.println(brand + " " + model + " " + engineVolume + " " +
                " литра," + " " + color + " " + productionYear + " " + productionCountry);
    }
}
