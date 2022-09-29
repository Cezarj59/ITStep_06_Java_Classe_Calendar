package homework_06;

import java.util.Calendar;
import java.util.Scanner;

public class Homework_06 {

    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        recebeData();
    }

    private static void recebeData() {
        Calendar dataAtual = Calendar.getInstance();

        int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);
        int mesAtual = dataAtual.get(Calendar.MONTH);
        int anoAtual = dataAtual.get(Calendar.YEAR);

        System.out.println(diaAtual + "/" + mesAtual + "/" + anoAtual);
        int dia, mes, ano;

        System.out.println("\nDigite sua data de Nascimento;\n");
        System.out.print("Digite o dia:");
        dia = leia.nextInt();
        System.out.print("Digite o mês:");
        mes = leia.nextInt() - 1;
        System.out.print("Digite o ano:");
        ano = leia.nextInt();

        Calendar dataDeNascimento = Calendar.getInstance();
        dataDeNascimento.set(ano, mes, dia);
        System.out.println("Data de nascimento: " + dataDeNascimento.getTime());
        
        if(diaAtual >= dia && mesAtual >= mes){
        System.out.println(anoAtual - ano + " anos.");
        }else{
         System.out.println((anoAtual - ano) - 1 + " anos.");}
    }

}
