package pacoteEffetive;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Esse metodo ler os arquivos no diretórios 

public class Leitor {

	public void moverArquivo(String arquivo, String arquivo2) {

		File file = new File("C:\\Users\\Usuário\\eclipse-workspace\\ProjectEffetive\\PENDENTE\\" + arquivo);

		if (!file.exists()) {
			System.out.println("Arquivo não encontrado");
		} else {

			// Diretorio de destino
			File diretorioDestino = new File("C:\\Users\\Usuário\\eclipse-workspace\\ProjectEffetive\\" + arquivo2);

			// Move o arquivo para o novo diretorio
			boolean sucesso = file.renameTo(new File(diretorioDestino, file.getName()));
			// System.out.println(sucesso);

		}
	}

//Esse metodo deleta os arquivos do diretorio 
	public void delete(String diretorio) {
		File folder = new File("C:\\Users\\Usuário\\eclipse-workspace\\ProjectEffetive\\" + diretorio + "");
		if (folder.isDirectory()) {
			File[] sun = folder.listFiles();
			for (File toDelete : sun) {
				toDelete.delete();
			}
		}
	}

	//Esse metodo visualiza os arquivos
	public void visualizarArquivos(String diretorio) {

		File file = new File("C:\\Users\\Usuário\\eclipse-workspace\\ProjectEffetive\\" + diretorio + "");
		File afile[] = file.listFiles();
		int i = 0;
		for (int j = afile.length; i < j; i++) {
			File arquivos = afile[i];
			System.out.println(arquivos.getName());
		}

	}

	//Esse metodo ler o arquivo de 1 por 1
	public void leitorDeArquivo(String arquivo) {

		String file = ("C:\\Users\\Usuário\\eclipse-workspace\\ProjectEffetive\\INVALIDO\\" + arquivo);
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	//Validador 
	public boolean validarArquivos(String arquivo) {
		String file = ("C:\\Users\\Usuário\\eclipse-workspace\\ProjectEffetive\\PENDENTE\\" + arquivo);
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			String[] coluna = null;

			while ((line = br.readLine()) != null) {
				// System.out.println(line);
				coluna = line.split(";");
			}
			if (coluna.length == 4) {
				System.out.println(coluna.length + " Colunas");
				System.out.println("Arquivo Valido");
				return true;

			} else {

				System.out.println("Arquivo Invalido");
				System.out.println("Falta colunas");
				return false;
			}

		} catch (FileNotFoundException e) {
			System.out.println("Nulo");
			System.out.println("Arquivo Invalido");
			return false;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}

}
