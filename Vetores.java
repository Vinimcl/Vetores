import java.util.Scanner;


public class Vetores {
    
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    // Vetores

    int[] vetor1 = new int[] {1, 4, 7, 3, 5};
    int varx = vetor1[2]; // 7
    int[] vetor2 = new int[4];
    vetor2[3] = 25; //atribuição de valor


    System.out.println("\nDados do vetor2");


    int contador = 0;
    while(contador < 4){

        System.out.println("Digite o valor: " + contador+1);
       // int vlr = scanner.nextInt();
       // vetor2[contador] = vlr;
       // contador++;
        vetor2[contador++] = scanner.nextInt();

    }


    // Repetidores
    for(int i = 0; i < 5; i++){
        int vlr = vetor1[i];
        System.out.println("Valor: " + vlr);
    }



scanner.close();

}


}
