package fr.umontpellier.iut.partie1;

public class AppTaquin {
    public static void main(String[] args) {
        int[][] data1 = {{1, 2, 3,4}, {5, 6, 7,8}, {9, 10, 11,12},{13,14,15,0}};
        int[][] data2 = {{1, 2, 3}, {4,5,6}, {7,8,0}};

        Taquin taquin1 = new Taquin(data1);
        Taquin taquin2 = new Taquin(data2);
        System.out.println(taquin2);
        System.out.println(taquin2.estGagnant());
    }
}
