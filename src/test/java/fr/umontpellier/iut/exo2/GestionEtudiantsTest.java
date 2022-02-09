package fr.umontpellier.iut.exo2;

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
    public void moyenne_should_give_14_point_4() {
        Etudiant toto=new Etudiant(
                "toto",
                "mimi",
                LocalDate.of(2001, 12, 3),
                "ee",
                "zzz",
                new ArrayList<>()
                );

        Matiere math=new Matiere("math",2.5);
        Matiere BD = new Matiere("BD",3);

        toto.noter(math,12);
        toto.noter(BD,14);
        double moy= toto.calculerMoyenne();

        assertEquals(14.4,moy);



    }
}