package application.service;

import application.entities.Nome;

public class ListaEncadeada {

	Nome primeiro = null;
	Nome ultimo = null;
	int total = 0;

	public boolean isVazia() {
		if (total == 0) {
			return true;
		}
		return false;
	}

	public void inserirNomeInicio(Nome a) {
		if (isVazia()) {
			primeiro = ultimo = a;
		} else {
			// alterando a referência do rótulo do primeiro elemento.
			a.setProximo(primeiro);
			// alterando o primeiro elemento da lista para o informado pelo
			// usuário.
			primeiro = a;
		}
		total++;
	}

	public void inserirNomeFim(Nome a) {
		// caso não existam nós inseridos, insere o primeiro nó (n) na lista
		if (isVazia()) {
			primeiro = ultimo = a;
		} else {
			ultimo.setProximo(a);
			ultimo = a;
		}
		total++;
	}

	public void exibirLista() {
		Nome temp = primeiro;
		if (isVazia() == false) {
			for (int i = 0; i < total; i++) {
				System.out.println("Posição " + i + " | nome: " + temp.nome);
				temp = temp.getProximo();
			}
		}
	}

	public int tamanho() {
		return total;
	}

	public void removeNome(Nome a) {
		Nome temp = primeiro;
		Nome anterior = null;
		if (total == 0) {
			System.out.println();
			System.out.println("┌─────────────────────────────────┐");
			System.out.println("│ LISTA VAZIA, IMPOSSÍVEL REMOVER │");
			System.out.println("└─────────────────────────────────┘");
			return;
		}
		if (total == 1) {
			primeiro = null;
			return;
		}
		anterior = temp;
		for (int i = 0; i < total; i++) {
			if (a.nome.equals(temp.nome)) {
				anterior.setProximo(temp.getProximo());
				total--;
				return;
			} else {
				System.out.println("to andando");
				anterior = temp;
				temp = temp.getProximo();
			}
		}
	}
}
