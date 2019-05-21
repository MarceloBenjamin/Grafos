package main;

import java.util.ArrayList;
import java.util.List;

import estrutura.Adj;
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
		List<Vertex> listaVertex = new ArrayList<>();
		listaVertex = data.retornaDados();
		
		//Calculando distancia e relacionando todos para todos
		List<Adj> listAdj = new ArrayList<>();
		for (int i = 0; i < listaVertex.size(); i++) {
			
			Adj nn = new Adj(listaVertex.get(i));
			
			for (int x = 0; x < listaVertex.size(); x++) {
				if (nn.getV().getNome().equals(listaVertex.get(x).getNome())) {
				}
				else {
					nn.gerarAdj(listaVertex.get(x));
				}
			
			}
			listAdj.add(nn);
		}
		
	}
	
}
