/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 6. Um determinado gás duplica seu volume a cada segundo. Dada um
volume inicial, em centímetros cúbicos, digitado pelo usuário
faça um programa que determine o tempo necessário para que
esse volume se torne maior que 1000 centímetros cúbicos.
(utilize while)
* Data de entrega: 30/4/2023
*/

import java.util.Scanner;
class Atividade6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o volume do gás em cm³: ");
        int volumeAtual = teclado.nextInt();
        teclado.close();
        int tempo = 0;
        while (volumeAtual <= 1000) {
            volumeAtual *= 2;   
            tempo++;
        }
        System.out.printf("É necessário %d segundos para que o volume desse gás chegue em %dcm³", tempo, volumeAtual);
    }
}
