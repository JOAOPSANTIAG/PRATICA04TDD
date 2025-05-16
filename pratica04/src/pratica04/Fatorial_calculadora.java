package pratica04;

public class Fatorial_calculadora {
    
    public static int fatorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fatorial(n - 1);
    }
}