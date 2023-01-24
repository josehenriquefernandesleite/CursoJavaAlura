public class TestaLacos {
    public static void main(String[] args) {

        int numeroTabuada;
        int contador;

        for (numeroTabuada = 1; numeroTabuada <= 10; numeroTabuada ++) {
            for (contador = -1; contador <= 10; contador ++) {
                if (contador == -1) {
                    System.out.println("Tabuada do " + numeroTabuada + " é: ");
                }
                else {
                    System.out.println(numeroTabuada + " x " + contador + " = " + numeroTabuada * contador);
                }
            }
        }
    }
}
