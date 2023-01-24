public class TesteSomatoria {
    public static void main(String[] args) {

        int contador = 0;
        int valor = 0;

        while (contador <= 10) {
            System.out.println("O valor do contador é: " + contador + " e a soma dos valores é: " + (contador + valor));
            valor = contador + valor;
            contador ++;
        }
    }
}