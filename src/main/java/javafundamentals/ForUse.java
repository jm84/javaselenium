package javafundamentals;

public class ForUse {
    public static void main(String[] args) {
        final int n = 15;
        mostrarNumeros1(n);
        mostrarNumeros2(n);
        mostrarNumeros3(n);
    }

//    secuencia:1,2,3.....,n-1
    static void mostrarNumeros1(int n){


        for (int i = 1; i < n ; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
    //    secuencia:1,2,3.....,n
    static void mostrarNumeros2(int n){
        for (int i = 1; i <= n ; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
    //    secuencia:n,n-1,.....,1
    static void mostrarNumeros3(int n){

        for (int i = n; i >=1 ; i--) {
            System.out.printf("%d ", i);
        }
    }
}
