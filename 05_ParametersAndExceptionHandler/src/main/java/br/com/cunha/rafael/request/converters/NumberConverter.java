package br.com.cunha.rafael.request.converters;

import br.com.cunha.rafael.exception.UnsupportedMathOperationExeception;

public class NumberConverter {
    public static Double convertToDouble(String strNumber) {
        if(strNumber == null || strNumber.isEmpty())
            throw new UnsupportedMathOperationExeception("Please set a numeric value!");

        String number  = strNumber.replace(",", "."); // R$ 5,00 USD 5.0

        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String strNumber) {
        if(strNumber == null || strNumber.isEmpty()) return false;

        String number  = strNumber.replace(",", "."); // R$ 5,00 USD 5.0

        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
