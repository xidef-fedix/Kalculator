
package calculator;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class clcltr {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);


        int rimResult = 0;
        String rimResultRim = "";
        String strArabSimbolOne = "";
        String strArabSymbolTwo = "";
        String rimSimbolOne = "";
        String rimSymbolTwo = "";
        String operanda = "";
        while (true) {
            System.out.println("Введите выражение: ");
            String x = s.nextLine();
            String finalResult = "";
            int probels = 0;
            for (char element : x.toCharArray()) {
                if (element == ' ') probels++;
            }
            if (probels == 2) {

                rimSimbolOne = (String.valueOf(razborNaSymvoly.splitInicialization(x, 1)));
                rimSymbolTwo = (String.valueOf(razborNaSymvoly.splitInicialization(x, 3)));
                strArabSimbolOne = (String.valueOf(razborNaSymvoly.splitInicialization(x, 1)));
                strArabSymbolTwo = (String.valueOf(razborNaSymvoly.splitInicialization(x, 3)));
                operanda = razborNaSymvoly.splitInicialization(x, 2);


                if (proverka.proverkaNaRimskie(rimSimbolOne) && proverka.proverkaNaRimskie(rimSymbolTwo)) {
                    int rimSymbolOneInt = zamena.zamenaRimskihNaArabskie(rimSimbolOne);
                    int rimSymbolTwoInt = zamena.zamenaRimskihNaArabskie(rimSymbolTwo);
                    rimResult = operacia.variantyOperaciy(rimSymbolOneInt, operanda, rimSymbolTwoInt);
                    rimResultRim = (perevod.perevodRimToArab(rimResult));
                    finalResult = finalResult + rimResultRim;

                } else if (proverkaArab.proverkaNaArabskie(strArabSimbolOne) && proverkaArab.proverkaNaArabskie(strArabSymbolTwo)) {
                    int arabSymbolOneInt = Integer.parseInt(strArabSimbolOne);
                    int arabSymbolTwoint = Integer.parseInt(strArabSymbolTwo);
                    int arabResult = operacia.variantyOperaciy(arabSymbolOneInt, operanda, arabSymbolTwoint);
                    finalResult = finalResult + arabResult;

                } else {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Вы ввели числа в разных системах счисления");
                        System.exit(0);

                    }
                }
                System.out.println("Ответ: " + finalResult);


            } else {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Вы ввели больше двух переменных");
                    System.exit(0);

                }
            }

        }
    }
}
