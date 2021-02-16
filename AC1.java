/**
 * 
 */
package AtividadeContinua;
import java.util.Arrays;

public class AC1 {
    static int[] vetor = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
	
    public int maior(){
        Arrays.sort(AC1.vetor);
        return AC1.vetor[AC1.vetor.length -1];
    }
    
    
    public int menor(){
        Arrays.sort(AC1.vetor);
        return AC1.vetor[0];
    }
    
    
    public int soma(){
            int sum = 0;
            for (int value : vetor) {
                sum += value;
            }
            return sum;

    }
    
    
    
    public int repeticoes(int numeroASerBuscado){
        int numeroDeVezesQueApareceNoVetor = 0;
        for (int i = 0; i < AC1.vetor.length; i++) {
            if (numeroASerBuscado == AC1.vetor[i]) {
                numeroDeVezesQueApareceNoVetor++;
            }
        }
        return numeroDeVezesQueApareceNoVetor;
    }

    
    public static void main(String[] args) {
        AC1 ac1 = new AC1();
        
	System.out.println("o Menor Numero : "+ ac1.menor());
	System.out.println("O Maior Numero : "+ ac1.maior());
        System.out.println("A soma é : "+ ac1.soma());
        System.out.println("O número 940 aparece 2 vezes : " + ac1.repeticoes(940));

    }
}
