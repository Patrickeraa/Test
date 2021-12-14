package pacote.main;

public class Usuario {
		String nome;
		String sobrenome;
		int alturaCm;
		Double peso;
		int idade;

		
		public Usuario(String nome, String sobrenome, int alturaCm, Double peso, int idade) {
			
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.alturaCm = alturaCm;
			this.peso = peso;
			this.idade = idade;		
		}
		
		public String getNome() {
			return nome;
		}
		
		
		public String getSobrenome() {
			return sobrenome;
		}
		
		public int getAlturaCm() {
			return alturaCm;
		}
		
		public int getIdade() {
			return idade;
		}
		
		public Double getPeso() {
			return peso;
		}
		
		
		
	}


