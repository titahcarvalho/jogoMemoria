package prova_p1;

public class Empresa {
	private int cnpj;
	private String nome;
	private String cidade;
	private Onibus [] onibus;
	private static int nBus;

	public Empresa (int cnpj, String nome, String cidade, Onibus[] onibus) {
		this.cnpj = cnpj;
		this.cidade = cidade;
		this.onibus = new Onibus [10];
		this.nBus = 0;
		
		}
	public double kmTotal() {
		double soma = 0.0;
		for(int i = 0; i < this.nBus; i++) {
			soma += this.onibus[i].getKm();
		}
		return soma;
		
	}
	public double maiorKm() {
		double maior = 0.0;
		for ( int i = 0; i < this.nBus;i++) {
			if ( this.onibus[i].getKm() > maior) {
				maior = this.onibus[i].getKm();
			}
			return maior;
		}
	}
	public double menorKm() {
		double menor = 1000.0;
		for ( int i = 0; i < this.nBus;i++) {
			if ( this.onibus[i].getKm() < menor) {
				menor = this.onibus[i].getKm();
			}
			return menor;
		}
	}
	}

