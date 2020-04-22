package com.appnetics;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int finishNUmber = 20;
        int count = 0;

//        while (number <= finishNUmber){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number  "+number);
//        }

        while (number <= finishNUmber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number  "+ number);
            count++;
            if (count >=5){
                break;
            }

        }
        System.out.println("the total number of even numbers in that range is " +count);

    }

    public static boolean isEvenNumber(int number){
        return number % 2==0;
    }
}
