package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Ruha {
    private String tulaj;
    private boolean tiszta;

    public Ruha(String tulaj) {
        this.tulaj = tulaj;
        this.tiszta = false;
    }


    public boolean getTiszta() {
        return tiszta;
    }


    public String getTulaj() {
        return tulaj;
    }


    public boolean isTiszta() {
        return tiszta;
    }


    public void setTiszta() {
        this.tiszta = true;
    }

    @Override
    public String toString() {
        return "Ruha: " + tulaj + " - " + (tiszta ? "Tiszta" : "Nem tiszta");
    }
}
