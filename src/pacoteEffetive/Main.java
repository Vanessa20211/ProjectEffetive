package pacoteEffetive;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Leitor ler = new Leitor();

//		ler.validarArquivos("texto.txt");
//		ler.moverArquivo("teste.txt", "VALIDADO");
		
		
		// Menu Princial 
		System.out.println("***********[ Menu ]***********");
		System.out.println("Digite 1 Para Deletar Arquivos");
		System.out.println("Digite 2 para Validar Arquivos");
		System.out.println("Digite 3 para Vasualizar Arquivos");
		System.out.println("*******************************");
		int numero = scanner.nextInt();
		System.out.println(numero);
		if (numero == 1) {
		//Menu Deletar 
			System.out.println("***********[ Menu ]***********");
			System.out.println("Digite 1 para deletar Pendentes ");
			System.out.println("Digite 2 para deletar Validos ");
			System.out.println("Digite 3 para deletar Invalidos ");
			System.out.println("******************************");
			int numerodeletar = scanner.nextInt();
			if (numerodeletar == 1) {
				ler.delete("PENDENTE");
				System.out.println("Diretório \\PENDENTE deletado com sucesso!");
			} else if (numerodeletar == 2) {
				ler.delete("VALIDADO");
				System.out.println("Diretório \\VALIDO deletado com sucesso!");
			} else if (numerodeletar == 3) {
				ler.delete("INVALIDO");
				System.out.println("Diretório \\INVALIDO deletado com sucesso!");
			}
		} else if (numero == 2) {
			//Menu deletar
			System.out.println("***********[ Menu Validar ]************");
			System.out.println("Digite o arquivo que você deseja validar");
			System.out.println("***************************************");
			String nomeValidar = scanner.next();
			ler.validarArquivos(nomeValidar);
			if (ler.validarArquivos(nomeValidar) == true) {
				ler.moverArquivo(nomeValidar, "VALIDADO");
			} else {
				ler.moverArquivo(nomeValidar, "INVALIDO");
			}

		} else if (numero == 3) {
			//Menu Visualizar
			System.out.println("***********[ Menu Visualizar ]***********");
			System.out.println("Digite 1 para Visualizar diretorio \\PENDENTE");
			System.out.println("Digite 2 Visualizar diretorio \\VALIDADO");
			System.out.println("Digite 3 Visualizar diretorio \\INVALIDO");
			System.out.println("*****************************************");
			int numeroVisualizar = scanner.nextInt();

			if (numeroVisualizar == 1) {
				ler.visualizarArquivos("PENDENTE");
			} else if (numeroVisualizar == 2) {
				ler.visualizarArquivos("VALIDADO");
			} else if (numeroVisualizar == 3) {
				ler.visualizarArquivos("INVALIDO");
			}

		}
		scanner.close();

	}

}
