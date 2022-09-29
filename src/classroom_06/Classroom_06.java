package classroom_06;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Classroom_06 {

    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

//      Classe Calendar
        Date hoje = new Date();

        System.out.println("Hoje é:---->" + hoje);
        System.out.println("-------------------------------------------------");
//      Como Calendar é uma classe abstrata, não pode ser instanciada, por isso necessario usar o método estatico getInstance();
        Calendar dataCalendario = Calendar.getInstance();

        System.out.println("\nData pelo Calendar:---->" + dataCalendario.getTime());
        System.out.println("\nDia do Mês pelo Calendar:---->" + dataCalendario.get(Calendar.DAY_OF_MONTH));
        System.out.println("\nMês pelo Calendar:---->" + dataCalendario.get(Calendar.MONTH));
        System.out.println("\nAno atual pelo Calendar:---->" + dataCalendario.get(Calendar.YEAR));
        System.out.println("\nDia da Semana pelo Calendar:---->" + dataCalendario.get(Calendar.DAY_OF_WEEK));
        System.out.println("\nDia corrido do Ano pelo Calendar:---->" + dataCalendario.get(Calendar.DAY_OF_YEAR));
        System.out.println("-------------------------------------------------");
        System.out.println("\nManipulação de data e hora com a Classe Calendar\n");

        dataCalendario.set(Calendar.DAY_OF_MONTH, 7);
        dataCalendario.set(Calendar.MONTH, 4);
        dataCalendario.set(Calendar.YEAR, 1993);
        System.out.println("\n" + dataCalendario.getTime());
        dataCalendario.set(2005, 5, 19);
        System.out.println("\n" + dataCalendario.getTime());
        dataCalendario.setTime(hoje);
        System.out.println("\n" + dataCalendario.getTime());
        System.out.println("-------------------------------------------------");
        System.out.println("\nUm if baseado na hora atual ele te responda bom dia, boa tarde ou boa noite.\n");

        if (dataCalendario.get(Calendar.HOUR_OF_DAY) >= 00 && dataCalendario.get(Calendar.HOUR_OF_DAY) < 12) {
            System.out.println("Bom Dia");
        } else if (dataCalendario.get(Calendar.HOUR_OF_DAY) >= 12 && dataCalendario.get(Calendar.HOUR_OF_DAY) < 18) {
            System.out.println("Boa Tarde");
        } else {
            System.out.println("Boa Noite");
        }

        /*----------------------------------------------------------------------------------------------------------------------------*/
        System.out.println("-------------------------------------------------");
        System.out.println("\nPrograma para mostrar a diferença de dias entre duas datas do ano Atual.\n");

        System.out.println("\nPrimeira data\n");
        System.out.print("Digite o dia:");
        int dia = leia.nextInt();
        System.out.print("Digite o mês, de 1 a 12:");
        int mes = leia.nextInt()- 1;

        Calendar data1 = Calendar.getInstance();
        data1.set(Calendar.DAY_OF_MONTH, dia);
        data1.set(Calendar.MONTH, mes);

        int diaDoAno1 = data1.get(Calendar.DAY_OF_YEAR);
        System.out.println("\nDia do ano da primeira data digitada: " + diaDoAno1);

        System.out.println("\nSegunda data\n");
        System.out.print("Digite o dia:");
        int dia2 = leia.nextInt();
        System.out.print("Digite o mês, de 1 a 12:");
        int mes2 = leia.nextInt() - 1;

        Calendar data2 = Calendar.getInstance();
        data2.set(Calendar.DAY_OF_MONTH, dia2);
        data2.set(Calendar.MONTH, mes2);

        int diaDoAno2 = data2.get(Calendar.DAY_OF_YEAR);
        System.out.println("Dia do ano da segunda data digitada: " + diaDoAno2);

        if (diaDoAno1 < diaDoAno2) {
            int aux = diaDoAno2;
            diaDoAno2 = diaDoAno1;
            diaDoAno1 = aux;
        }
        int difData = diaDoAno1 - diaDoAno2;
        System.out.println("\nDiferença de dias entre as datas digitadas: " + difData);
    }

}
