package javafundamentals.usefor;

public class ejemplo1 {
    public static void main(String[] args) {

        final int n = 15;
        final var cont1=  contarValores(n);
        System.out.println(cont1);
    }
    // secuencia: 1,2,....,  n -1
    // filtro : numeros pares
    // contar
    static int contarValores(int n){
    var contador = 0;

        for (int i = 1; i < n; i++) {
           if (i%2 == 0){
               contador ++;
           }
        }
    return contador;
    }
}


