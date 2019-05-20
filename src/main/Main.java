package main;

import java.util.List;

import estrutura.GerarAdj;
import estrutura.RecuperaVertex;
import estrutura.Vertex;
import files.RecuperarTexto;

public class Main {

	public static void main(String[] args) {
		//Recuperando arquivo de texto
		RecuperarTexto rec = new RecuperarTexto();
		String te = rec.retornaTexto();
		
		//Extraindo informações do texto
		RecuperaVertex data = new RecuperaVertex(te);
		List<Vertex> listaVertex = data.retornaDados();
		
		//Calculando distancia e relacionando todos para todos
		GerarAdj ga = new GerarAdj(listaVertex);
		
		
	}
	
}
