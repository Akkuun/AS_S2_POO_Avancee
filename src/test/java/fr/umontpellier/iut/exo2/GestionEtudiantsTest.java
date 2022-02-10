package fr.umontpellier.iut.exo2;

import fr.umontpellier.iut.exo2.exo1.Departement;
import fr.umontpellier.iut.exo2.exo1.Etudiant;
import fr.umontpellier.iut.exo2.exo1.Matiere;
import fr.umontpellier.iut.exo2.exo1.Note;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GestionEtudiantsTest {

    @Disabled
    @Test
    public void test_if_main_method_does_not_throw_exceptions() {

        assertDoesNotThrow(() -> GestionEtudiants.main(new String[1]));

    }

    // 2 4
    @Test
    public void test_calcul_moyenne_retourne_moyenne_quand_plusieurs_notes_avec_differents_coefficients() {
        Etudiant toto = new Etudiant(
                "toto",
                "mimi",
                LocalDate.of(2001, 12, 3),
                "ee",
                "zzz",
                new ArrayList<>()
        );
        Matiere math = new Matiere("math", 2.5);
        Matiere BD = new Matiere("BD", 3);
        Matiere Com = new Matiere("Com", 1);
        Matiere Prog = new Matiere("Prog", 8);
        toto.noter(math, 12);
        toto.noter(Prog, 17);
        toto.noter(Com, 14);
        toto.noter(BD, 18);
        double moy = toto.calculerMoyenne();
        assertEquals(16.13, moy, 0.01);
    }

    @Test
    public void test_calcul_moyenne_retourne_zero_Quand_Pas_De_Note() {
        Etudiant toto = new Etudiant(
                "toto",
                "mimi",
                LocalDate.of(2001, 12, 3),
                "ee",
                "zzz",
                new ArrayList<>()
        );
        Matiere math = new Matiere("math", 2.5);
        Matiere BD = new Matiere("BD", 3);
        double moy = toto.calculerMoyenne();
        assertEquals(0, moy, 0.1);
    }


    @Test
    public void test_calcul_moyenne_retourne_valeur_note_quand_une_seule_note_avec_coefficient() {
        Etudiant toto = new Etudiant(
                "toto",
                "mimi",
                LocalDate.of(2001, 12, 3),
                "ee",
                "zzz",
                new ArrayList<>()
        );
        Matiere math = new Matiere("math", 2.5);

        toto.noter(math, 12);

        double moy = toto.calculerMoyenne();
        assertEquals(12, moy, 0.1);
    }

    @Test
    public void test_calcul_moyenne_retourne_valeur_note_quand_une_seule() {
        Etudiant toto = new Etudiant(
                "toto",
                "mimi",
                LocalDate.of(2001, 12, 3),
                "ee",
                "zzz",
                new ArrayList<>()
        );
        Matiere math = new Matiere("math", 2.5);
        toto.noter(math, 12);


        double moy = toto.calculerMoyenne();
        assertEquals(12, moy, 0.1);
    }


    @Test
    public void test_calcul_moyenne_departement_doit_retourner_13_avec_deux_etudiant_avec_12_et_13() {
        Etudiant toto = new Etudiant(
                "toto",
                "mimi",
                LocalDate.of(2001, 12, 3),
                "ee",
                "zzz",
                new ArrayList<>()
        );
        Etudiant mimi = new Etudiant(
                "mimi",
                "pouf",
                LocalDate.of(2003, 2, 3),
                "eoooaoa",
                "zzz",
                new ArrayList<>()
        );
        Departement d1 = new Departement("info", "Paris", new ArrayList<>());

        d1.inscrire(toto);
        d1.inscrire(mimi);

        Matiere math = new Matiere("math", 2.5);
        toto.noter(math, 12);
        mimi.noter(math, 14);

        double moy = d1.getMoyennePromo();
        assertEquals(13, moy, 0.1);
    }

    @Test
    public void test_calcul_moyenne_departement_doit_retourner_13_avec_trois_etudiant_avec_12_et_13_et_18() {
        Etudiant toto = new Etudiant(
                "toto",
                "mimi",
                LocalDate.of(2001, 12, 3),
                "ee",
                "zzz",
                new ArrayList<>()
        );
        Etudiant mimi = new Etudiant(
                "mimi",
                "pouf",
                LocalDate.of(2003, 2, 3),
                "eoooaoa",
                "zzz",
                new ArrayList<>()
        );
        Etudiant momo = new Etudiant(
                "momo",
                "louf",
                LocalDate.of(2003, 2, 7),
                "eoooaoa",
                "zzz",
                new ArrayList<>()
        );
        Departement d1 = new Departement("info", "Paris", new ArrayList<>());

        d1.inscrire(toto);
        d1.inscrire(mimi);
        d1.inscrire(momo);
        Matiere math = new Matiere("math", 2.5);
        toto.noter(math, 12);
        mimi.noter(math, 14);
        momo.noter(math, 18);

        double moy = d1.getMoyennePromo();
        assertEquals(14.6, moy, 0.1);
    }


}