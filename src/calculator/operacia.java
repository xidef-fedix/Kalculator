package calculator;

import java.io.IOException;

public class operacia {
    public static int variantyOperaciy(int pervayaPeremennaya, String operanda, int vtorayaPeremennaya) throws IOException {
        int result = 0;


        if (operanda.equals("+") || operanda.equals("-") || operanda.equals("*") || operanda.equals("/")) {
            switch (operanda) {
                case "+":
                    result = pervayaPeremennaya + vtorayaPeremennaya;
                    break;
                case "-":
                    result = pervayaPeremennaya - vtorayaPeremennaya;
                    break;
                case "*":
                    result = pervayaPeremennaya * vtorayaPeremennaya;
                    break;
                case "/":
                    result = pervayaPeremennaya / vtorayaPeremennaya;
                    break;
            }
        } else {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Неверный оператор ");
                System.exit(0);
            }



        }
        return result;
    }
}
