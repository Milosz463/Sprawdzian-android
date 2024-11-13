package com.example.myapplication;

public class Pytania {
    int obraz;
    boolean odpowiedz;
    boolean czyPoprawna;

    public Pytania(int obraz, boolean odpowiedz) {
        this.obraz = obraz;
        this.odpowiedz = odpowiedz;
        czyPoprawna=false;
    }

    public int getObraz() {
        return obraz;
    }

    public boolean isOdpowiedz() {
        return odpowiedz;
    }

    public boolean isCzyPoprawna() {
        return czyPoprawna;
    }

    public void setCzyPoprawna(boolean czyPoprawna) {
        this.czyPoprawna = czyPoprawna;
    }
}
