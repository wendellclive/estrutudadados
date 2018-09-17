package application.service;

import application.entities.Nome;

public class ListaSequencial {

	Nome[] nomes = new Nome[100];
	int n = 0; // posição (indice) do ultimo elemento da lista

	public boolean isVazia() {

		return (n == 0);

	}

	public boolean isCheia() {

		return (n == nomes.length);

	}

	public int tamanho() {

		return n;

	}

	public Nome buscar(int pos) {

		// verifica se a variável pos é valida
		if ((pos >= n) || (pos < 0)) {
			return null;
		}

		return nomes[pos];

	}

	public boolean Compara(Nome c1, Nome c2) {

		return (c1.getNome().equals(c2.getNome()));

	}

	public int getPosicao(Nome nome) {

		for (int i = 0; i < n; i++) {

			if (Compara(nomes[i], nome))
				return i;

		}

		return -1;
	}

	public void deslocaDireita(int pos) {

		for (int i = n; i > pos; i--)
			nomes[i] = nomes[i - 1];
	}

	public void deslocaEsquerda(int pos) {

		for (int i = pos; i < n - 1; i++)
			nomes[i] = nomes[i + 1];
	}

	public boolean inserir(int pos, Nome nome) {
		if (isCheia() || (pos > n) || (pos < 0))
			return false;
		deslocaDireita(pos);
		nomes[pos] = nome;
		n++;
		return true;

	}

	public boolean remover(int pos) {
		if (pos >= n || pos < 0)
			return false;
		deslocaEsquerda(pos);
		n--;
		return true;
	}

	public void exibirLista() {
		for (int i = 0; i < n; i++) {
			System.out.println("Numero " + (i + 1) + " Nome: " + nomes[i].getNome());
		}
	}

}
