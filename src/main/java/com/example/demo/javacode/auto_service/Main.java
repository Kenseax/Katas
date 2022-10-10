package com.example.demo.javacode.auto_service;

/* Написать сервися для проведения техосмотра автомобиля
   Если на вход подаётся Автобус - его не проверять
   Прописать свой эксепшен, если не пройден техосмотр
*  */

public class Main {
    private static Car car = new Car("04.04.98", 10943, 1200_000 );
    private static Truck truck = new Truck("04.04.05", 10943, 800_000 );
    private static Truck truck2 = new Truck("04.04.05", 10943, 200_000 );
    private static Bus bus = new Bus("04.04.05", 10943, 200_000 );

    public static void main(String[] args) throws AutoServiceFuckedUpException {

        AutoService<Car> carService = new AutoService<>();
        //Выводит Exception
        carService.checkTypeOfAutoAndPrintResult(car);

        AutoService<Truck> truckService = new AutoService<>();
        //Выводит Exception
        truckService.checkTypeOfAutoAndPrintResult(truck);
        //Отработает нормально
        truckService.checkTypeOfAutoAndPrintResult(truck2);

        AutoService<Bus> busAutoService = new AutoService<>();
        //Выведет ответ для автобуса
        busAutoService.checkTypeOfAutoAndPrintResult(bus);
    }

}
