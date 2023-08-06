package calculator;

import java.util.Arrays;
import java.util.Objects;

public class Calculator {
    private Calculator() {}

    public static Calculator calculator() {
        return new Calculator();
    }

    public float addition(float number1, float number2){
        return number1 + number2;
    }

    public float subtract(float number1, float number2){
        return number1 - number2;
    }

    public float product(float number1, float number2) {
        return number1 * number2;
    }

    public float division(float number1, float number2) {
        return number1 / number2;
    }

    public int elderlyNumber(float number1, float number2, float number3) {
        int[] output = {(int) number1, (int) number2, (int) number3};
        Arrays.sort(output);
        return output [2];
    }

    public boolean palindromic(String number) {
        String aux;
        StringBuilder palindromicOut;
        palindromicOut = new StringBuilder(number).reverse();
        aux = palindromicOut.toString();
        return Objects.equals(number, aux);
    }
}
