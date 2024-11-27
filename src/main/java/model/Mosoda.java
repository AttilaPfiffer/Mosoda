package model;

public class Mosoda {
    private Ruha[] ruhak;
    private int db;

    public Mosoda() {
        this(5);
    }

    public Mosoda(int db) {
        this.ruhak = new Ruha[db];

    }

    public void bevesz(Ruha ruhak) {

        if (db < ruhak.length) {
            ruhak[db++] = ruha;  
            System.out.println(ruha.getTulajdonosNeve() + " ruhája be lett véve a mosodába.");
        } else {
            System.out.println("A mosoda tele van, nem tudunk több ruhát felvenni.");
        }
    }

    public Ruha kiad() {

    }

    public void mos() {

    }
}
