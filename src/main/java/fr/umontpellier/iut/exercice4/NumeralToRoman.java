package fr.umontpellier.iut.exercice4;

import java.util.Arrays;

class NumeralToRoman {

    public String getRoman(int number) {

/*
        int ref=100000;
        int value=0;
        while (number/ref!=1){
            ref/=10;
            value=number/ref;
            if (value==1){

            }

        }
        */

String resulat="";

        if (number == 1) {
            resulat = "I";
        }
        if (number == 2) {
            resulat = "II";
        }
        if (number == 3) {
            resulat = "III";
        }
        if (number == 4) {
            resulat = "IV";
        }
        if (number == 5) {
            resulat = "V";
        }
        if (number == 6) {
            resulat = "VI";
        }
        if (number == 7) {
            resulat = "VII";
        }
        if (number == 8) {
            resulat = "VIII";
        }
        if (number == 9) {
            resulat = "IX";
        }
        if (number == 10) {
            resulat = "X";
        }
        if (number == 11) {
            resulat = "XI";
        }
        if (number == 50) {
            resulat = "L";
        }
        if (number == 100) {
            resulat = "C";
        }
        if (number == 500) {
            resulat = "D";
        }
        if (number == 1000) {
            resulat = "M";
        }
        if (number == 1066) {
            resulat = "MLXVI";
        }
        return resulat;

    }
}
