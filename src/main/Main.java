package main;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String te = "";
		
		//Recuperar dados do arquivo .txt
		Path caminho = Paths.get("C:/Users/famil/Documents/Marcelo/CCO/Grafos/Grafos/dados.txt");		
		try {
			byte[] texto =  Files.readAllBytes(caminho);
			te = new String(texto);		
		} catch (Exception erro) {
			System.out.println("Erro: Arquivo não encontrado!");
		}
		
		RecuperaDados data = new RecuperaDados(te);
		List<Vertex> listaVertex = data.retornaDados();
		listaVertex.size();
		
	}
	
}
