package com.futuretrainings.jg.exceptions;

public class Konto {
    private int kontonummer;

    public double getSaldo() {
        return saldo;
    }

    private double saldo;

    /**
     * Standardkontruktur
     */
    public Konto() {
    }

    public Konto(int kontonummer, double betrag) throws KontoAusnahme {
        if (betrag < 0) {
            throw new KontoAusnahme("Negativer Saldo: " + betrag);
        }
        this.saldo = betrag;
    }

    public void zahleEin(double betrag) throws KontoAusnahme {
        if (betrag < 0) {
            throw new KontoAusnahme("Bei Einzahlung nur positive Beträge! betrag = " + betrag);
        }
        this.saldo += betrag;
    }

    public void zahleAus(double betrag) throws KontoAusnahme {
        if (betrag < 0) {
            throw new KontoAusnahme("Kein negativer Betrag beim Einzahlen! betrag = " + betrag);
        }
        if (this.saldo < betrag) {
            throw new KontoAusnahme("Der Betrag muss kleiner als der Saldo sein.");
        }
        this.saldo -= betrag;
    }


    public String toString() {
        return "Kontonummer = " + this.kontonummer + " Saldo = " + this.saldo;
    }
}
