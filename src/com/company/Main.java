package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1.Создание сканера, и новых автомобилей класса "Car"
        Scanner in = new Scanner(System.in);
        Car auto1 = new Car();
        Car auto2 = new Car();
        Car auto3 = new Car();

        //2.Вывод на экран
        auto1.inputCar(in);//ввод параметров 1-го автомобиля
        auto2.inputCar(in);//ввод параметров 2-го автомобиля
        auto3.inputCar(in);//ввод параметров 3-го автомобиля
        System.out.println("\nИнформация об автомобилях:");
        auto1.displayCar();//вывод параметров 1-го автомобиля на экран
        auto2.displayCar();//вывод параметров 2-го автомобиля на экран
        auto3.displayCar();//вывод параметров 3-го автомобиля на экран
        //расчета налогов на  автомобили
        System.out.println("\nРасчет налогов на автомобили со ставкой: " + Car.getTaxRate() + " руб. ");

        //Налог на 1-й автомобиль
        System.out.println("Налог на " + auto1.ageTheCar() + " летний автомобиль " + auto1.getName() +
                " мощностью " + auto1.getPower() + " л.с., составляет " + auto1.taxCalculation() + " руб.");
        //Налог на 2-й автомобиль
        System.out.println("Налог на " + auto2.ageTheCar() + " летний автомобиль " + auto2.getName() +
                " мощностью " + auto2.getPower() + " л.с., составляет " + auto2.taxCalculation() + " руб.");
        //Налог на 3-й автомобиль
        System.out.println("Налог на " + auto3.ageTheCar() + " летний автомобиль " + auto3.getName() +
                " мощностью " + auto3.getPower() + " л.с., составляет " + auto3.taxCalculation() + " руб.");

        //изменяем налоговую ставку с 1 на 2
        Car.setTaxRate(2);//с помощью setters
        System.out.println("\nС учётом изменения налоговой ставки: " + Car.getTaxRate() + " руб. ");

        //расчета налога на 1-й автомобиль с учетом новой налоговой ставки
        System.out.println("Налог на " + auto1.ageTheCar() + " летний автомобиль " + auto1.getName() +
                " мощностью " + auto1.getPower() + " л.с., составляет " + auto1.taxCalculation() + " руб.");

        //расчета налога на 2-й автомобиль с учетом новой налоговой ставки
        System.out.println("Налог на " + auto2.ageTheCar() + " летний автомобиль " + auto2.getName() +
                " мощностью " + auto2.getPower() + " л.с., составляет " + auto2.taxCalculation() + " руб.");

        //расчета налога на 3-й автомобиль с учетом новой налоговой ставки
        System.out.println("Налог на " + auto3.ageTheCar() + " летний автомобиль " + auto3.getName() +
                " мощностью " + auto3.getPower() + " л.с., составляет " + auto3.taxCalculation() + " руб.");

        in.close();//закрываем сканер

        //конструктор без параметров - по умолчанию
        System.out.println("\nКонструктор без параметров:" + "\n" + new Car());

        //конструктор  с 4-мя параметрами:
        System.out.println("\nКонструктор с 4-мя параметрами:" + "\n" +
                new Car(" ЗИЛ ", "X 000 XXX XX", 300, 2010));

        System.out.println("\nЗададим новые параметры автомобилю №1:");
        auto1.setName("Lexus");
        auto1.setRegNum("X 777 XX 55 RUS");
        auto1.setPower(500);
        auto1.setYearProduct(2022);
        System.out.println("Наш новый автомобиль: " + auto1.getName() + ", год выпуска " + auto1.getYearProduct() +
                ", регистрационный номер " + auto1.getRegNum() + ", мощность: " + auto1.getPower() +
                " л.с., налог составляет " + auto1.taxCalculation() + " руб.");

    }
}
