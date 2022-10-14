import transport.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Водители
        Driver<PassengerCar> ivanov = new Driver<>("Иванов", "A678", 10);
        Driver<Truck> petrov = new Driver<>("Петров", "B345", 10);;
        Driver<Bus> sidorov = new Driver<>("Сидоров", "C567", 10);
        Driver smirnov = new Driver("Сидоров", "ABCC111", 15);//smirnov может водить любые машины

        //список водителей легковых машин
        ArrayList<Driver<PassengerCar>> driversForPassengerCars = new ArrayList<>();
        driversForPassengerCars.add(ivanov);
        driversForPassengerCars.add(smirnov);//smirnov может водить любые машины

        //список водителей грузовых машин
        ArrayList<Driver<Truck>> driversForTrucks = new ArrayList<>();
        driversForTrucks.add(petrov);
        driversForTrucks.add(smirnov);//smirnov может водить любые машины

        //список водителей автобусов
        ArrayList<Driver<Bus>> driversForBuses = new ArrayList<>();
        driversForBuses.add(sidorov);
        driversForBuses.add(sidorov);

        //спонсоры
        Sponsor sponsor1 = new Sponsor("Денежкин Петр");
        Sponsor sponsor2 = new Sponsor("ООО Отмывайка");
        Sponsor sponsor3 = new Sponsor("ОАО Завод по очистке воздуха");
        Sponsor sponsor4 = new Sponsor("Козлов Сидор");

        ArrayList<Sponsor> sponsors1 = new ArrayList<>();
        sponsors1.add(sponsor1);
        sponsors1.add(sponsor2);
        sponsors1.add(sponsor3);

        ArrayList<Sponsor> sponsors2 = new ArrayList<>();
        sponsors2.add(sponsor2);
        sponsors2.add(sponsor3);
        sponsors2.add(sponsor4);

        ArrayList<Sponsor> sponsors3 = new ArrayList<>();
        sponsors3.add(sponsor1);
        sponsors3.add(sponsor3);
        sponsors3.add(sponsor4);

        ArrayList<Sponsor> sponsors4 = new ArrayList<>();
        sponsors4.add(sponsor1);
        sponsors4.add(sponsor2);
        sponsors4.add(sponsor4);

        //механики
        Mechanic<PassengerCar> mechanic1 = new Mechanic<>("Наливайкин", "Василий", "ООО Шиномотаж");
        Mechanic<Truck> mechanic2 = new Mechanic<>("Колесов", "Петр", "ООО Шиномотаж");
        Mechanic<Bus> mechanic3 = new Mechanic<>("Домкратов", "Лев", "ИП Дократов");
        Mechanic mechanicUniversal = new Mechanic("Отверткин", "Павел", "ООО Открути");

        ArrayList<Mechanic<PassengerCar>> mechanicsPassenger = new ArrayList<>();
        mechanicsPassenger.add(mechanic1);
        mechanicsPassenger.add(mechanicUniversal);

        ArrayList<Mechanic<Truck>> mechanicsTrucks = new ArrayList<>();
        mechanicsTrucks.add(mechanic2);
        mechanicsPassenger.add(mechanicUniversal);

        ArrayList<Mechanic<Bus>> mechanicsBuses = new ArrayList<>();
        mechanicsBuses.add(mechanic3);
        mechanicsBuses.add(mechanicUniversal);

        //легковые машины
        PassengerCar lada = new PassengerCar("Lada", "Grande", 1.7f, PassengerCar.Body.SEDAN,
            ivanov, sponsors1, mechanicsPassenger);
        PassengerCar audi = new PassengerCar("Audi", "A8 50 L TDI quattro", 3f, PassengerCar.Body.PICKUP,
            smirnov, sponsors2, mechanicsPassenger);
        PassengerCar bmw = new PassengerCar("BMW", "Z8", 3f, PassengerCar.Body.HATCHBACK,
                ivanov, sponsors3, mechanicsPassenger);
        PassengerCar kia = new PassengerCar("Kia", "Sportage 4 поколение", 2.4f, null,
                smirnov, sponsors4, mechanicsPassenger);

        //грузовые машины
        Truck kamaz = new Truck("КамАЗ", "4308", 5.9f, 3f,
                petrov, sponsors4, mechanicsTrucks);
        Truck man = new Truck("MAN", "Tgm", 7f, 6f,
                smirnov, sponsors3, mechanicsTrucks);
        Truck volvo = new Truck("Volvo", "FM", 6.5f, 7f,
                petrov, sponsors1, mechanicsTrucks);
        Truck scania = new Truck("Scania", "R500", 8.5f, 14f,
                smirnov, sponsors2, mechanicsTrucks);

        //автобусы
        Bus paz = new Bus("ПАЗ", "3205", 5f, 18,
            sidorov, sponsors3, mechanicsBuses);
        Bus liaz6228 = new Bus("ЛиАЗ", "6228 Вояж L", 6f, 70,
                smirnov, sponsors4, mechanicsBuses);
        Bus liaz5292 = new Bus("ЛиАЗ", "5292", 6.5f, 110,
                smirnov, sponsors1, mechanicsBuses);
        Bus nefaz = new Bus("НефАЗ", "52998", 5.5f, 55,
                sidorov, sponsors2, mechanicsBuses);

        //Список всех автомобилей
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(lada);
        cars.add(audi);
        cars.add(bmw);
        cars.add(kia);

        cars.add(kamaz);
        cars.add(man);
        cars.add(volvo);
        cars.add(scania);

        cars.add(paz);
        cars.add(liaz5292);
        cars.add(liaz6228);
        cars.add(nefaz);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addToQueue(lada);
        serviceStation.addToQueue(man);
        serviceStation.addToQueue(paz);
        serviceStation.addToQueue(bmw);

        serviceStation.carInspection();
        serviceStation.carInspection();
        serviceStation.carInspection();
        serviceStation.carInspection();


    }
}