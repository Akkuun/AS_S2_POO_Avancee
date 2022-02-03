package fr.umontpellier.iut.exercice1;


public class FizzBuzz {


    public String getValue(int i) {
        String s = "";

        if (i % 3 == 0) {
            s = s + "Fizz";
        }
        if (i % 5 == 0) {
            s = s + "Buzz";
        }
        if (s.equals("")) {
            s = String.valueOf(i);
        }
    return s;
        /*
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 5 == 0) { //cas multiple de 5
            return "Buzz";
        } else if (i % 3 == 0) { // cas multiple de 3

            return "Fizz";
        } else {
            return String.valueOf(i);
        }*/
    }

    public String[] computeList(int i) {
        String[] tabString = new String[i];
        for (int j = 0; j < i; j++) {
            tabString[j] = getValue(j+1);
        }
        return tabString;
    }
}
