package com.company;

import java.util.Calendar;

import java.util.Scanner;

// класс "Автомобиль"
public class Car {
    // поля класса "Автомобиль"
    private String name;  //название авто
    private String regNum;  //регистрационный номер
    private int power;   //мощность двигателя л.с.
    private int yearProduct;  //год выпуска автомобиля

    // статическое поле класса "Автомобиль"
    private static double taxRate = 1;        // Налоговая ставка

    // конструкторы

    // 1. конструктор без параметров - по умолчанию
    public Car() {
        // инициализация полей по умолчанию
        name = " \"Car\"";
        regNum = "A 000 AA 54 RUS";
        power = 80;
        yearProduct = 1987;
    }

    // 2. конструктор с 4-мя параметрами
    public Car(String name, String regNum, int power, int yearProduct) {
        this.name = name;
        this.regNum = regNum;
        this.power = power;
        this.yearProduct = yearProduct;
    }

    // getters

    public static double getTaxRate() {
        return taxRate;
    }

    public String getName() {
        return name;
    }

    public String getRegNum() {
        return regNum;
    }


    public double getPower() {

        return power;
    }

    public int getYearProduct() {

        return yearProduct;
    }

    // setters
    public static void setTaxRate(int tax) {
        taxRate = tax;
    }

    public void setName(String value) {
        name = value;
    }

    public void setRegNum(String value) {
        regNum = value;
    }

    public void setPower(int value) {
        power = value;
    }

    public void setYearProduct(int value) {
        yearProduct = value;
    }

    //  методы

    // Метод ввода данных автомобиля с клавиатуры
    public void inputCar(Scanner in) {
        System.out.print("Введите название автомобиля:");
        name = in.nextLine();
        System.out.print("Введите регистрационный номер автомобиля типа \"A 000 AA 54 RUS\": ");
        regNum = in.nextLine();
        while (true) {
            System.out.print("Введите мощность двигателя автомобиля (л.с): ");
            power = in.nextInt();
            in.nextLine();
            if (power < 1)
                System.out.println("Некорректные данные, введите мощность двигателя  больше 0 ");
            else break;
        }
        while (true) {
            System.out.print("Введите год выпуска автомобиля: ");
            yearProduct = in.nextInt();
            in.nextLine();
            if (yearProduct < 1970 || yearProduct > 2022)
                System.out.println("Некорректные данные, введите год произвродства автомобиля от 1970 до 2022");
            else break;
        }
    }

    // метод вывода класса Car на консоль
    public void displayCar() {
        // сводим вывод объекта на консоль к выводу его строкового представления
        System.out.println(toString());
    }

    // метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        return "Автомобиль " + name + ", год выпуска " + yearProduct + ", регистрационный номер " +
                regNum + ", мощность: " + power + " л.с.";
    }

    //  метод определения возраста автомобиля
    public int ageTheCar() {
        Calendar realYear = Calendar.getInstance();
        return realYear.get(Calendar.YEAR) - yearProduct;

    }

    //  метод расчета налога на автомобиль
    public double taxCalculation() {
        double tax = (power * taxRate) - ((double) ageTheCar() / taxRate);
        return tax;
    }
}


