/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 4. Faça um programa que solicite ao usuário que digite um número
até que ele digite um número menor que 0 (utilize while)
* Data de entrega: 30/4/2023
*/

import java.util.Scanner;
class Atividade4{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        while (numero >= 0) {
            System.out.print("Digite um número qualquer: ");
            numero = teclado.nextInt();
        }
        System.out.println("O número digitado é menor do que 0.");
        teclado.close();
    }
}