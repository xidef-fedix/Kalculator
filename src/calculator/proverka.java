package calculator;

public class proverka {
    public  static boolean proverkaNaRimskie(String rimskiy){
        boolean b = false;
        switch (rimskiy){
            case "I":
                b = true;
            case "II":
                b = true;
            case "III":
                b = true;
            case "IV":
                b = true;
            case "V":
                b = true;
            case "VI":
                b = true;
            case "VII":
                b = true;
            case "VIII":
                b = true;
            case "IX":
                b = true;
            case "X":
                b = true;
                break;
        }
        return b;
    }
}
