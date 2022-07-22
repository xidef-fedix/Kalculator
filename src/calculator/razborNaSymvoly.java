package calculator;

import java.util.Arrays;

public class razborNaSymvoly {

    public static String splitInicialization(String upperSplit, int i) {
        String[] resultSplit = new String[5];
        resultSplit = upperSplit.split(" ");
        String symbol = "";
        String symbolProverka = "";


        switch (i){
            case 1:
                symbol = Arrays.toString(new String[]{resultSplit[0]});
                break;
            case 2:
                symbol = Arrays.toString(new String[]{resultSplit[1]});
                break;
            case 3:
                symbol = Arrays.toString(new String[]{resultSplit[2]});
                break;
            case 4:
                symbol = Arrays.toString(new String[]{resultSplit[3]});
                break;

        }
        if (symbol.length() == 3) {
            symbol = "" + symbol.charAt(1);

        }  else if (symbol.length() ==4){
            symbol = "" + symbol.charAt(1) + symbol.charAt(2);
        } else if (symbol.length() == 5) {
            symbol = "" + symbol.charAt(1) + symbol.charAt(2) + symbol.charAt(3);
        }



        return symbol;
    }

}
