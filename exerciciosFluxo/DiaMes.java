package exerciciosFluxo;

import java.util.Scanner;

public class DiaMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero ref ao mês de 1 a 12 : ");
        int numMes = sc.nextInt();
        if (numMes == 1) {
            System.out.print("Janeiro : ");
        } else if (numMes == 2) {
            System.out.print(" Fevereiro : ");
        } else if (numMes == 3) {
            System.out.print(" Março : ");
        } else if (numMes == 4) {
            System.out.print(" Abril : ");
        } else if (numMes == 5) {
            System.out.print(" Maio : ");
        } else if (numMes == 6) {
            System.out.print(" Junho : ");
        } else if (numMes == 7) {
            System.out.print(" Julho : ");
        } else if (numMes == 8) {
            System.out.print(" Agosto : ");
        } else if (numMes == 9) {
            System.out.print(" Setembro : ");
        } else if (numMes == 10) {
            System.out.print(" Outubro : ");
        } else if (numMes == 11) {
            System.out.print(" Novembro : ");
        }else if (numMes == 12) {
            System.out.print(" Dezembro : ");
        }System.out.print(" Valor invalido : ");

        sc.close();
    }
}
