package application.entities;

public class Nome {

	public String nome;
	public Nome proximo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Nome getProximo() {
		return proximo;
	}

	public void setProximo(Nome proximo) {
		this.proximo = proximo;
	}

}
