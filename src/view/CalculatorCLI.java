package view;

public class CalculatorCLI {
    private CalculatorCLI() {}

    public static CalculatorCLI getMenu() {
        return new CalculatorCLI();
    }

    public void printMenu() {
        System.out.println("*********************************");
        System.out.println("  Calculadora de Calculator S.A  ");
        System.out.println("*********************************");
        System.out.print("\n");
        System.out.println("-----------------------------");
        System.out.println("--       Opciones          --");
        System.out.println("-----------------------------");
        System.out.print("\n");
        System.out.println("\t1. Sumar");
        System.out.println("\t2. Restar");
        System.out.println("\t3. Multiplicar");
        System.out.println("\t4. Dividir");
        System.out.println("\t5. Número mayor de 3 números");
        System.out.println("\t6. Capiúa");
        System.out.print("\n");
        System.out.println("\t0. Salir");
        System.out.print("\n");
        System.out.print("Introduzca una opción: ");
    }

    public void showErrorMsg() {
        System.out.print("\n");
        System.out.println("--------------------------------------------");
        System.out.println("Opción errónea");
        System.out.println("--------------------------------------------");
        System.out.print("\n");
    }

    public void showNumberMsg1() {
        System.out.print("Introduzca el primer número: ");
    }
    public void showNumberMsg2() {
        System.out.print("Introduzca el segundo número: ");
    }

    public void showNumberMsg3() {
        System.out.print("Introduzca el tercer número: ");
    }

    public void showPalindromicMsg() {
        System.out.print("Introduzca el número a comprobar: ");
    }

    public void result(float result, float num1, float num2) {
        System.out.print("\n");
        System.out.println("--------------------------------------------");
        System.out.println("El resultado es: "+result);
        System.out.println("--------------------------------------------");
        System.out.print("\n");
    }

    public void indeterminate() {
        System.out.println("Error division por 0");
    }

    public void elderlyNumber(float num3) {
        System.out.print("\n");
        System.out.println("--------------------------------------------");
        System.out.println("EL número "+num3+" es el mayor de los 3 números");
        System.out.println("--------------------------------------------");
        System.out.print("\n");
    }

    public void isPalindromic(String palindromic) {
        System.out.print("\n");
        System.out.println("--------------------------------------------");
        System.out.println(palindromic+" SI es capicua");
        System.out.println("--------------------------------------------");
        System.out.print("\n");
    }

    public void isNotPalindromic(String palindromic) {
        System.out.print("\n");
        System.out.println("--------------------------------------------");
        System.out.println(palindromic+" NO es capicua");
        System.out.println("--------------------------------------------");
        System.out.print("\n");
    }
}
