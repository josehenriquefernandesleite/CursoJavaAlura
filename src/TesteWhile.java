public class TesteWhile {
    public static void main(String[] args) {

        int contador = 0;

        while (contador <= 10) {
            if (contador < 10) {
                System.out.print(contador + " - ");
            }
            else {
                System.out.println(contador);
            }
            contador ++;
        }
    }
}
