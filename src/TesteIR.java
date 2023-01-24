/*
O João gostaria de criar um programa sobre Imposto de Renda (IR) e verificou as regras de alíquota. Ele descobriu no site da receita:

De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636
*/
public class TesteIR {

    public static void main(String[] args) {

        double salario = 2300.0;

        if (salario >= 1900.0 && salario <= 2800.0) {
            double deducao = salario * 0.075;
            System.out.println("A dedução é: " + deducao + " com um salario de: " + salario);
        }
    }
}