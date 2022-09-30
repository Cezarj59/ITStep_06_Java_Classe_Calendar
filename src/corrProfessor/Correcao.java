package corrProfessor;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Correcao {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int dia, mes, ano;

        System.out.println("Informe a data de nascimento: ");
        System.out.print("Dia: ");
        dia = leia.nextInt();

        System.out.print("Mês: ");
        mes = leia.nextInt();
        mes--;

        System.out.print("Ano: ");
        ano = leia.nextInt();

        Calendar nascimento = Calendar.getInstance();
        nascimento.set(Calendar.DAY_OF_MONTH, dia);
        nascimento.set(Calendar.MONTH, mes);
        nascimento.set(Calendar.YEAR, ano);
        System.out.println("Data informada: " + nascimento.getTime());

        Calendar hoje = Calendar.getInstance();

        int idade = hoje.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR);

        if (mes > hoje.get(Calendar.MONTH)) {
            idade--;
        } else if (mes == hoje.get(Calendar.MONTH)
                && dia > hoje.get(Calendar.DAY_OF_MONTH)) {
            idade--;
        }
        System.out.println("Idade: " + idade);

    }
}
