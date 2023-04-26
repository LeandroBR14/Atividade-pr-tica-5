

/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 2. Faça um programa que imprima todos os números pares de 1 a 100 na ordem inversa
* Data de entrega: 30/4/2023
*/

class Atividade2{
    public static void main(String[] args) {
        System.out.println("Segue abaixo todos os números pares de 0 a 100 na ordem inversa.");
        for (int i=100; i >0; i--){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }    
}