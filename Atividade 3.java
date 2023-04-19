/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 3. Faça um programa que some os números de 1 a 100 e imprima somente o valor total da soma
* Data de entrega: 30/4/2023
*/

class Atividade3{
    public static void main(String[] args) {
        System.out.print("A soma de todos os números de 1 a 100 é de:");
        int isoma = 0;
        for (int i=1; i <=100; i++){
            isoma += i;
        }
        System.out.println(" " +isoma);
    }
}