public class java {

    public static int fatorial(int n) {
        if (n == 0) {
            return 1; // Fatorial de 0 é 1
        } else {
            return n * fatorial(n - 1); // Chamada recursiva
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Fibonacci de 0 é 0
        } else if (n == 1) {
            return 1; // Fibonacci de 1 é 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Chamada recursiva
        }
    }

    public static int contarDigitos(int n) {
        if (n < 10) {
            return 1; // Se o número é menor que 10, tem apenas um dígito
        } else {
            return 1 + contarDigitos(n / 10); // Chamada recursiva, dividindo o número por 10
        }
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false; // Se os caracteres nas extremidades são diferentes, não é um palíndrome
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}