package com.company;


class Vliegtuig {
    int gewicht;

    public Vliegtuig(int gewicht) {
        this.gewicht = gewicht;
    }

    public boolean opstijgen(boolean torenToestemming, int windkracht) {
        return (torenToestemming && (gewicht < 1000 || windkracht > 50));
    }

    public int berekenPrijs(int passagier, boolean service, boolean nederlands) {
        int kosten = 0;
        if (gewicht < 1000) {
             kosten = 100;
        }
        else if (gewicht >= 1000 && gewicht <5000) {
            kosten = 500;
        }
        else if (gewicht >= 5000) {
            kosten = 2500;
        }
       if (passagier > 2) {
           kosten *= 1.5;
       }
       if (service) {
           kosten += 800;
       }
       if (nederlands) {
           kosten *= 1.21;
       }
       return kosten;
    }


}
public class Main {

    public static void main(String[] args) {
	Vliegtuig Cessa = new Vliegtuig(1000);
        System.out.println(Cessa.berekenPrijs(3, false, false));
        Vliegtuig Boeing = new Vliegtuig(-1);



    }
}
