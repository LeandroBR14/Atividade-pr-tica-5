/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 1. Faça um programa que imprima todos os números pares de 1 a 100
* Data de entrega: 30/4/2023
*/


class Atividade1{
    public static void main(String[] args) {
        System.out.println("Segue abaixo todos os números pares de 0 a 100.");
        for (int i=0; i <=100; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }    
}