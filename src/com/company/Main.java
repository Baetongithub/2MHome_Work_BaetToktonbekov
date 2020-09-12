package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(methodString(50, 25));
        System.out.println(methodString(60, 26));
        System.out.println(methodString(70, 27));
        System.out.println(methodString(80, 28));
        System.out.println(methodString(90, 29));
        System.out.println(methodString(110, 31));
    }

    public static String methodString(int age, int temperatureOnStreet) {

        String result = age + " " + temperatureOnStreet;

        if (age <= 45 && temperatureOnStreet <= 30)
            result = "Можно идти гулять.";
        else if (age < 20 && temperatureOnStreet <= 28)
            result = "Можно идти гулять.";
        else if (temperatureOnStreet <= 25 || age > 45)
            result = "Можно идти гулять.";
        else
            result = "Оставайтесь дома.";

        return result;
    }
}
