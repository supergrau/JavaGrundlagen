package com.futuretrainings.jg.aufgaben.exceptions;

public class Monat {
    private int monat;

    public Monat(int monat) throws MonatAusnahme {
        if ( monat < 1 || 12 < monat )
            throw new MonatAusnahme(monat + " ist kein Monat");
        this.monat = monat;
    }

    public String getMonatsname() {
        return switch (monat) {
            case 1 -> "Januar";
            case 2 -> "Februar";
            case 3 -> "März";
            case 4 -> "April";
            case 5 -> "Mai";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            case 12 -> "Dezember";
            default -> null;
        };
    }
}
