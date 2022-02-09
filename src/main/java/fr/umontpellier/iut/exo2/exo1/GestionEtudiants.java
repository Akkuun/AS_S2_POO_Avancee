package fr.umontpellier.iut.exo2.exo1;


import java.time.LocalDate;
import java.util.ArrayList;

public class GestionEtudiants {
    public static void main(String[] args) {//4
        Etudiant lolo = new Etudiant(
                "lolo",
                "John",
                LocalDate.of(2001, 12, 3),
                "lololeboss@gmail.com",
                "64 allee de l'enclos",
                new ArrayList<>()
        );
        lolo.toString();
        Etudiant toto = lolo;//ici toto aura la même réference que toto
//par contre vu que ils ont la même référence tout chagement sur toto , le même changement se fera sur lolo et inversement
        //6
        if (lolo.equals(toto)) { //evidemment cette condition ne sera jamais  si on  créée deux constructeur distinct on alloue deux emplacement mémoires different donc pas la même référence
            System.out.println("lolo et toto sont identique");
        } else {
            System.out.println("lolo et toto ne possède pas la même référence");
        }

        //7
        ArrayList<Etudiant> tt = new ArrayList<Etudiant>();
        tt.add(lolo);
        Departement d1 = new Departement("math", "France", tt);
        System.out.println(d1.toString());
        //10

        Etudiant fifi = new Etudiant(
                "fifi",
                "zizou",
                LocalDate.of(2001, 4, 13),
                "zozolebouf@gmail.com",
                "32 allee de l'enclos",new ArrayList<>()
        );
        Etudiant riri = new Etudiant(
                "riri",
                "pfff",
                LocalDate.of(2003, 2, 3),
                "samere@gmail.com",
                "9 allee de l'enclos",new ArrayList<>()
        );


        ArrayList l = new ArrayList<Etudiant>();
        l.add(lolo);
        l.add(fifi);
        l.add(toto);
        l.add(riri);

        Departement dd = new Departement("math", "Paris", l);
        dd.inscrire(lolo);
        dd.inscrire(fifi);
        dd.inscrire(toto);
        dd.inscrire(riri);
        dd.desinscrire(toto);
        System.out.println(dd.toString());
    }
}
