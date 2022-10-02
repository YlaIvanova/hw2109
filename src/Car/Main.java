package Car;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car();

       lada.brand = " LADA";
       lada.model = " Granta";
       lada.engineVolume = 1.7;
       lada.productionCountry = " Россия ";
       lada.color = " желтый";
       lada.productionYear = 2015;
       lada.collectData();

        Car audi = new Car();

        audi.brand = " Audi";
        audi.model = " A8 50 L TDI quattro";
        audi.engineVolume = 3.0;
        audi.productionCountry = " Германия ";
        audi.color = " черный";
        audi.productionYear = 2020;
        audi.collectData();

        Car bmv = new Car();

        bmv.brand = " BMW ";
        bmv.model = " Z8 ";
        bmv.engineVolume = 3.0;
        bmv.productionCountry = " Германия ";
        bmv.color = " черный";
        bmv.productionYear = 2021;
        bmv.collectData();

        Car kia = new Car();

        kia.brand = " Kia ";
        kia.model = " Sportage 4 поколение ";
        kia.engineVolume = 2.4;
        kia.productionCountry = " Южная Корея ";
        kia.color = " красный ";
        kia.productionYear = 2018;
        kia.collectData();


        Car hyundai = new Car();

        hyundai.brand = " Hyundai ";
        hyundai.model = " Hyundai ";
        hyundai.engineVolume = 1.6;
        hyundai.productionCountry = " Южная Корея ";
        hyundai.color = " оранжевый ";
        hyundai.productionYear = 2016;
        hyundai.collectData();
    }
}
