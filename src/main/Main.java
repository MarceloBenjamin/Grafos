package main;

import java.util.List;

import estrutura.RecuperaVertex;
import estrutura.Vertex;
import files.RecuperarTexto;

public class Main {

	public static void main(String[] args) {
		RecuperarTexto rec = new RecuperarTexto();
		String te = rec.retornaTexto();
		
		RecuperaVertex data = new RecuperaVertex(te);
		List<Vertex> listaVertex = data.retornaDados();
		listaVertex.size();
	}
	
}
