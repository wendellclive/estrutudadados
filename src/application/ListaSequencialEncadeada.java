package application;

import java.io.IOException;
import java.util.Scanner;

import application.entities.Nome;
import application.service.ListaEncadeada;
import application.service.ListaSequencial;

public class ListaSequencialEncadeada {

	public static void main(String[] args) throws IOException {

		ListaSequencial listaSequencial = new ListaSequencial();
		ListaEncadeada listaEncadeada = new ListaEncadeada();

		Scanner sc = new Scanner(System.in);

		String lsSequencial = null, lsEncadeada = null;
		char opcao;
		char escolha;

		do {

			opcao = menuPrincipal();

			switch (opcao) {
			case '1':

				do {

					System.out.println("┌──────────────────────────────────────────────┐");
					System.out.println("│    << LISTA SEQUENCIAL - MENU DE OPÇÕES >>   │");
					System.out.println("├──────────────────────────────────────────────┤");
					escolha = menuSecundario();

					switch (escolha) {
					case '1':
						if (lsSequencial == null) {
							System.out.println();
							System.out.print("Digite o nome da Lista SEQUENCIAL a ser CRIADA: ");
							lsSequencial = sc.nextLine();
							System.out.println("LISTA sob o nome: " + lsSequencial + " foi criada com SUCESSO!!");
							System.out.println("Pressione qualquer tecla para continua...");
							sc.nextLine();
						} else {
							System.out.println();
							System.out.println("┌─────────────────────────────────┐");
							System.out.println("│       LISTA JA FOI CRIADA       │");
							System.out.println("└─────────────────────────────────┘");
							System.out.println("Pressione qualquer tecla para retornar para o menu...");
							sc.nextLine();
						}
						break;
					case '2':
						if (lsSequencial == null) {
							System.out.println();
							System.out.println("┌──────────────────────────────────┐");
							System.out.println("│ LISTA VAZIA! RETORNE PARA O MENU │");
							System.out.println("└──────────────────────────────────┘");
							System.out.println("Pressione qualquer tecla para continua...");
							sc.nextLine();
						} else {
							Nome name = new Nome();
							System.out.print("Digite um nome para inserir na lista: ");
							name.setNome(sc.nextLine());
							listaSequencial.inserir(listaSequencial.tamanho(), name);
							break;
						}
					case '3':
						System.out.println();
						if (listaSequencial.isVazia()) {
							System.out.println();
							System.out.println("┌─────────────────────────────────┐");
							System.out.println("│ LISTA VAZIA, IMPOSSÍVEL REMOVER │");
							System.out.println("└─────────────────────────────────┘");
							System.out.print("Pressione qualquer tecla para continua...");
							sc.nextLine();
						} else {
							System.out.print("Qual posição da lista deseja remover ? ");
							listaSequencial.remover(sc.nextInt());
						}
						break;
					case '4':
						if (listaSequencial.isVazia()) {
							System.out.println();
							System.out.println("┌──────────────────────────────────┐");
							System.out.println("│ LISTA VAZIA! RETORNE PARA O MENU │");
							System.out.println("└──────────────────────────────────┘");
							System.out.println("Pressione qualquer tecla para continua...");
							sc.nextLine();

						} else {
							System.out.println();
							listaSequencial.exibirLista();
							System.out.println();
							System.out.println("A lista: " + lsSequencial + " contem um Total de Elementos de: "
									+ listaSequencial.tamanho());
							System.out.println();
							System.out.println("Pressione qualquer tecla para continua...");
							sc.nextLine();
						}
						break;
					case '5':
						escolha = '5';
						break;
					}
				} while (escolha != '5');
				break;
			case '2':

				do {

					System.out.println("┌──────────────────────────────────────────────┐");
					System.out.println("│    << LISTA ENCADEADA - MENU DE OPÇÕES >>    │");
					System.out.println("├──────────────────────────────────────────────┤");
					escolha = menuSecundario();

					switch (escolha) {
					case '1':
						if (lsEncadeada == null) {
							System.out.println();
							System.out.print("Digite o nome da Lista ENCADEADA a ser CRIADA: ");
							lsEncadeada = sc.nextLine();
							System.out.println("LISTA sob o nome: " + lsEncadeada + " foi criada com SUCESSO!!");
							System.out.println("Pressione qualquer tecla para continua...");
							sc.nextLine();
						} else {
							System.out.println();
							System.out.println("┌─────────────────────────────────┐");
							System.out.println("│       LISTA JA FOI CRIADA       │");
							System.out.println("└─────────────────────────────────┘");
							System.out.println("Pressione qualquer tecla para retornar para o menu...");
							sc.nextLine();
						}
						break;
					case '2':
						if (lsEncadeada == null) {
							System.out.println();
							System.out.println("┌──────────────────────────────────┐");
							System.out.println("│ LISTA VAZIA! RETORNE PARA O MENU │");
							System.out.println("└──────────────────────────────────┘");
							System.out.println("Pressione qualquer tecla para continua...");
							sc.nextLine();

						} else {

							Nome name = new Nome();
							System.out.print("Digite um nome para inserir na lista: ");
							name.setNome(sc.nextLine());
							System.out.print("Inserir no inicio ou Fim (I/F) da Lista ? ");
							String inifim = sc.nextLine();
							if (inifim.equalsIgnoreCase("i")) {
								listaEncadeada.inserirNomeInicio(name);
							} else if (inifim.equalsIgnoreCase("f")) {
								listaEncadeada.inserirNomeFim(name);
							}
						}
						break;
					case '3':
						System.out.println();
						System.out.print("Qual Nome deseja remover ? ");
						Nome p1 = new Nome();
						p1.nome = sc.next();
						listaEncadeada.removeNome(p1);
						/*
						 * if (listaEncadeada.removeNome(p1) { System.out.println(p1 +
						 * " foi REMOVIDO com Sucesso!!"); System.out.println();
						 * System.out.print("Pressione qualquer tecla para continua..."); sc.nextLine();
						 * } else { System.out.println("Não foi possivel remover o nome: " + p1);
						 * System.out.println();
						 * System.out.print("Pressione qualquer tecla para continua..."); sc.nextLine();
						 * }
						 */
						// }
						break;
					case '4':
						if (listaEncadeada.isVazia()) {
							System.out.println();
							System.out.println("┌──────────────────────────────────┐");
							System.out.println("│ LISTA VAZIA! RETORNE PARA O MENU │");
							System.out.println("└──────────────────────────────────┘");
							System.out.println("Pressione qualquer tecla para continua...");
							sc.nextLine();
						} else {
							System.out.println();
							listaEncadeada.exibirLista();
							System.out.println();
							System.out.println("A lista: " + lsEncadeada + " contem um Total de Elementos de: "
									+ listaEncadeada.tamanho());
							System.out.println();
							System.out.println("Pressione qualquer tecla para continua...");
							sc.nextLine();
						}
						break;
					case '5':
						break;
					}
				} while (escolha != '5');
				break;
			case '3':
				System.out.println();
				System.out.println("─────────────────────────────────────────>>>>");
				System.out.println("Sistema Encerrado !!!!!");
				break;
			}

		} while (opcao != '3');

		sc.close();
		System.exit(0);
	}

	public static char menuPrincipal() {
		System.out.println("┌──────────────────────────────────────────────┐");
		System.out.println("│            << MENU DE OPÇÕES >>              │");
		System.out.println("├──────────────────────────────────────────────┤");
		System.out.println("│  1. LISTA SEQUENCIAL                         │");
		System.out.println("│  2. LISTA ENCADEADA                          │");
		System.out.println("│  3. SAIR                                     │");
		System.out.println("└──────────────────────────────────────────────┘");
		System.out.print("Escolha sua Opção de ListaSequencial: ");
		String opcao;
		opcao = new Scanner(System.in).next();
		return opcao.charAt(0);
	}

	public static char menuSecundario() {

		System.out.println("│  1. CRIAR LISTA                              │");
		System.out.println("│  2. INSERIR ELEMENTO                         │");
		System.out.println("│  3. REMOVER ELEMENTO                         │");
		System.out.println("│  4. EXIBIR LISTA                             │");
		System.out.println("│  5. RETORNAR AO MENU ANTERIOR                │");
		System.out.println("└──────────────────────────────────────────────┘");
		System.out.print("Escolha sua Opção: ");
		String escolha;
		escolha = new Scanner(System.in).next();
		return escolha.charAt(0);

	}

}
