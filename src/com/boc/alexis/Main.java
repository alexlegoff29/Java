package com.boc.alexis;

import com.boc.alexis.models.Audi;
import com.boc.alexis.models.CarType;
import com.boc.alexis.models.GearBoxType;
import com.boc.alexis.models.MotorType;

import java.util.Arrays;
import java.util.Optional;

public class Main {
    /*public static void main(String[] args){
        System.out.println("===========================================>");
        System.out.println("SEMAINE");
        System.out.println("===========================================>");
        int businessDays = 1;
        switch (businessDays){
            case 1 :
            case 2 :
                System.out.println("Hello début de semaine");
                break;
            case 3 :
                System.out.println("Hello milieu de semaine");
                break;
            case 4 :
            case 5 :
                System.out.println("Hello c'est bientot le week-end");
                break;
            default :
                System.out.println("Hello c'est le weekend");
                break;


        }

        System.out.println("===========================================>");
        System.out.println("DECOMPTE");
        System.out.println("===========================================>");
        int i =0;
        int k =0;
        while (i<10){
            System.out.println("Mon i est : " + i );
            i++;
        }
        System.out.println("===========================================>");
        for (int j =0; j < 10; j++){
            System.out.println("Mon j est : " + j );
        }
        System.out.println("===========================================>");
        do {
            System.out.println("Mon k est : " + k);
            k++;
        } while (k < 10);

        System.out.println("===========================================>");
        System.out.println("Hello world");


        System.out.println("===========================================>");
        System.out.println("TABLEAUX");
        System.out.println("===========================================>");
        String[] fruits = {"Banane", "Orange", "Fraise", "Pomme"};
        for (int m = 0; m < fruits.length; m++) {
            System.out.println(m + ". " + fruits[m]);
        }
        System.out.println(fruits);

        System.out.println("// Commencer par le nombre 1 (PAS LE 0 DE BASE)");
        for (int m = 0; m < fruits.length; m++) {
            int fruitNumber = m + 1;
            System.out.println(fruitNumber + ". " + fruits[m]);
        }
        System.out.println(fruits);

        System.out.println("//Plus rapide MAIS n'affiche pas les nombres devant");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        System.out.println(fruits);
    }

     */
    public static void main(String[] args){
        Optional<Audi> optionalRs7 = getRs7();
        Audi rs7 = new Audi();
        if(optionalRs7.isPresent()){
            rs7 = optionalRs7.get();
            System.out.println(rs7.toString());
        }

        // -- Deuxieme façon
        Audi rs7New = getRs7().orElse(new Audi());
        System.out.println(rs7New.toString());
    }

    static Optional<Audi> getRs7(){
        Audi rs7 = new Audi();
        rs7.setModel("RS7");
        rs7.setMotorization(600);
        rs7.setSize(2);
        rs7.setOptions(Arrays.asList("leather seat", "warsing seat"));
        rs7.setCarSunRoof(true);
        // -- Heritage
        rs7.setMotor(MotorType.GASOLINE);
        rs7.setBrand(Audi.class.getSimpleName());
        rs7.setColor("Blue");
        rs7.setRims("Rotor 21\"");
        rs7.setGearbox(GearBoxType.AUTOMATIC);
        rs7.setType(CarType.SUV);

        return Optional.of(rs7);
    }
}
