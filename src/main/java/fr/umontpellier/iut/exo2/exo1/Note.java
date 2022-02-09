package fr.umontpellier.iut.exo2.exo1;

public class Note {
    // 2   2
    private Matiere matiere;
    private float note;


    public Note(Matiere matiere,float note){
        this.matiere=matiere;
        this.note=note;

    }

    public float getNote() {
        return note;
    }

    public Matiere getMatiere() {
        return matiere;
    }
}

