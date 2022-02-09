package fr.umontpellier.iut.exercice4;

import java.util.Objects;

public class RomanToNumeral {

    public int getNumeral(String romanNumber) {

int result=0;
        if (Objects.equals(romanNumber, "I")) {
           result=1;
        }

        if (Objects.equals(romanNumber, "II")) {
            result=2;
        }
        if (Objects.equals(romanNumber, "III")) {
            result=3;
        }
        if (Objects.equals(romanNumber, "IV")) {
           result=4;
        }
        if (Objects.equals(romanNumber, "II")) {
          result=2;
        }
        if (Objects.equals(romanNumber, "V")) {
          result =5;
        }  if (Objects.equals(romanNumber, "X")) {
            result =10;
        }
        if (Objects.equals(romanNumber, "L")) {
            result =50;
        } if (Objects.equals(romanNumber, "D")) {
            result =500;
        }
        if (Objects.equals(romanNumber, "C")) {
            result =100;
        }
        if (Objects.equals(romanNumber, "M")) {
            result =1000;
        }
        if (Objects.equals(romanNumber, "VI")) {
            result =6;
        }
        if (Objects.equals(romanNumber, "VII")) {
            result =7;
        }

        if (Objects.equals(romanNumber, "VIII")) {
            result =8;
        }
        if (Objects.equals(romanNumber, "IX")) {
            result =9;
        }if (Objects.equals(romanNumber, "XI")) {
            result =11;
        }
        if (Objects.equals(romanNumber, "XII")) {
            result =12;
        }
        if (Objects.equals(romanNumber, "XL")) {
            result =40;
        }
        if (Objects.equals(romanNumber, "XC")) {
            result =90;
        }
        if (Objects.equals(romanNumber, "CD")) {
            result =400;
        }
        if (Objects.equals(romanNumber, "CM")) {
            result =900;
        }
        if (Objects.equals(romanNumber, "XLIX")) {
            result =49;
        }
        if (Objects.equals(romanNumber, "XCIX")) {
            result =99;
        }

        return result;
    }
}
