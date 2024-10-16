public class Main {

	public static void main(String[] args) {
		Candidato candidato = new Candidato(10,"Elias Gomes");
		
		System.out.println("Numero de votos iniciais: " + candidato.getVotos());
		
		candidato.incrementarVotos();
		
		System.out.println("Candidato: " + candidato.getNome());
		System.out.println("Número: " + candidato.getNumero());
		System.out.println("Total de votos: " + candidato.getVotos());
	}

}
