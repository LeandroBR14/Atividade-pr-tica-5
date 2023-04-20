/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 7. Escreva um programa que, dada a carga máxima de um elevador e
a quantidade máxima de pessoas digitadas pelo usuário, leia o
peso de cada pessoa, também digitada pelo usuário, que entra
no elevador até que a carga máxima seja atingida ou o número
máximo de pessoas seja atingido (utilize do / while).
* Data de entrega: 30/4/2023
*/

import java.util.Scanner;
class Atividade7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int pessoasAtuais = 0;
        double pesoPessoa;
        double cargaAtual = 0;

        System.out.print("Digite a carga máxima do elevador: ");
        int cargaMaxElevador = teclado.nextInt();

        System.out.print("Digite a quantidade máxima de pessoas no elevador: ");
        int quantidadeMaxPessoas = teclado.nextInt();

        do {
            System.out.print("Digite o peso da pessoa (em kg): ");
            pesoPessoa = teclado.nextDouble();
            if (cargaAtual + pesoPessoa <= cargaMaxElevador && pessoasAtuais < quantidadeMaxPessoas) {
                cargaAtual += pesoPessoa;
                pessoasAtuais++;
            } else {
                System.out.println("Não é possível adicionar mais pessoas no elevador, o limite de carga ou de pessoas foi atingido.");
            }   
        } while (cargaAtual < cargaMaxElevador && pessoasAtuais < quantidadeMaxPessoas);

        System.out.printf("O elevador está com %d pessoas, totalizando em %.2f kg.", pessoasAtuais, cargaAtual);
        teclado.close();
    }
}
