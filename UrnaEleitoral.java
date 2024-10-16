import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UrnaEleitoral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Candidato>candidatos = new  ArrayList<>();
    
        System.out.println("Quantos candidatos deseja cadastrar?");
        int quantidadeCandidatos = scanner.nextInt();
    
        for (int i = 0; i < quantidadeCandidatos; i++) {
        System.out.println("Digite o número do candidato: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome do candidato: ");
        String nome = scanner.nextLine();
        candidatos.add(new Candidato(numero, nome));
        }
        System.out.println("Quantos números de candidatos serão lidos? ");
        int quantidadeVotos = scanner.nextInt();
    
        for (int i = 0; i < quantidadeVotos; i++) {
        System.out.println("Digite o número do candidato que recebeu um voto: ");
        int numeroVoto = scanner.nextInt();
        boolean encontrado = false;
    
        for(Candidato c : candidatos) {
        if (c.getNumero() == numeroVoto) {
        c.incrementarVotos();
        encontrado = true;
        break;
        }
        }
        if (!encontrado) {
        System.out.println("Candidato não encontrado: " + numeroVoto);
    
        }
        }
    
        System.out.println("\nResultados da Eleição: ");
        for (Candidato c : candidatos) {
        System.out.println(c.getNumero() + " - " + c.getNome() + " - Votos: " + c.getVotos());
    
        }
        scanner.close();
    
    
    
    
        
            
    }
    }
    

