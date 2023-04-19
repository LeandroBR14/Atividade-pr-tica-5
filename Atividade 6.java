/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 6. Um determinado gás duplica seu volume a cada segundo. Dada um
volume inicial, em centímetros cúbicos, digitado pelo usuário
faça um programa que determine o tempo necessário para que
esse volume se torne maior que 1000 centímetros cúbicos.
(utilize while)
* Data de entrega: 30/4/2023
*/

class Atividade6 {
    public static void main(String[] args) {
        int volumeInicial = 1;
        int volumeAtual = volumeInicial;
        int tempo = 0;
        while (volumeAtual <= 1000) {
            volumeAtual *= 2;   
            tempo++;
        }
        System.out.println(" " +volumeAtual +tempo);
    }
}
