package pratica04;

public class main {

    public static void main(String[] args) {
        Fatorial_calculadora calc = new Fatorial_calculadora();
        int resultado = calc.fatorial(5);
        System.out.println("Fatorial de 5 é: " + resultado);
    }
}