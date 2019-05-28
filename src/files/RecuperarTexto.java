package files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RecuperarTexto {
	public String retornaTexto() {
		String te = "";
		//Recuperar dados do arquivo .txt
				Path caminho = Paths.get("C:\\Users\\1712130084\\Downloads\\Grafos\\dados.txt");		
				try {
					byte[] texto =  Files.readAllBytes(caminho);
					te = new String(texto);		
				} catch (Exception erro) {
					System.out.println("Erro: Arquivo n�o encontrado!");
				}
		
		return te;
	}
}
