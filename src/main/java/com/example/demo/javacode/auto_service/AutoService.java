package com.example.demo.javacode.auto_service;

public class AutoService<T extends Auto> {

    public void checkTypeOfAutoAndPrintResult(T auto) {
        if (auto instanceof Bus) {
            System.out.println("Наш сервис не предоставляет " +
                    "обслуживание для автобусов");
            return;
        }
        try {
            System.out.println(doService(auto));
        } catch (AutoServiceFuckedUpException e) {
            e.printStackTrace();
        }
    }

    public String doService(T auto) throws AutoServiceFuckedUpException {
        int chance = getRandomNumber(1, 100);
        String ok = "Техосмотр пройден!";
        if (auto.getMileage() > 1_000_000) {
            if (chance > 95) {
                return ok;
            } else {
                throw new AutoServiceFuckedUpException("Ууу, ну тут жопа");
            }
        } else if (auto.getMileage() > 500_000) {
            if (chance > 80) {
                return ok;
            } else {
                throw new AutoServiceFuckedUpException("Ну типа ещё норм, но уже нет, переделывай");
            }
        } else if (auto.getMileage() > 100_000) {
            if (chance > 20) {
                return ok;
            } else {
                throw new AutoServiceFuckedUpException("Почти хорош");
            }
        } else {
            if (chance > 1) {
                return ok;
            }
            throw new AutoServiceFuckedUpException("Ебааааать ты лох, не повезло");
        }
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
