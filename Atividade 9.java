/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 9. Faça um programa que preencha com zeros todas as posições de
uma matriz com 10 linha e 10 colunas
* Data de entrega: 30/4/2023
*/

class Atividade9 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int i;
        int j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                matriz[i][j] = 0;
            }
        }
        for (i = 0; i < 10; i++) { // Imprime as matrizes para verificar se tá com [0][0]
            for (j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}