package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        freeTime(generateRandomAgeOfMan(),  generateRandomTemperature());
        freeTime(generateRandomAgeOfMan(),  generateRandomTemperature());
        freeTime(generateRandomAgeOfMan(),  generateRandomTemperature());
        freeTime(generateRandomAgeOfMan(),  generateRandomTemperature());
        freeTime(generateRandomAgeOfMan(),  generateRandomTemperature());
    }
    public static void freeTime(int ageOfMan, int temperature){
        if ((ageOfMan > 20 && ageOfMan < 45) && (temperature > -20 && temperature < 30)){
            System.out.println(" Можно идти гулять ");
            return;
        }
        if (ageOfMan < 20 && (temperature > 0 && temperature < 28)){
            System.out.println(" Можно идти гулять ");
            return;
        }
        if (ageOfMan > 45 && (temperature > -10 && temperature < 25)){
            System.out.println(" Можно идти гулять ");
        }else {
            System.out.println(" Оставайтесь дома ");
        }
    }
    public static int generateRandomAgeOfMan(){
        Random first = new Random();
        int num_1;
        num_1 = first.nextInt(50) + 1;
        return num_1;
    }
    public static int generateRandomTemperature(){
        Random second = new Random();
        int num_2;
        num_2 =second.nextInt(40) + -40;
        return num_2;
    }
}



