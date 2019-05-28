package algoritmo;

import java.util.ArrayList;
import java.util.List;

import estrutura.Adj;
import estrutura.Digraph;
import estrutura.Vertex;

public class Dijkstra {
	double dis;
	Digraph graph = new Digraph(new ArrayList<Adj>());
	
	public Dijkstra(double dis, Digraph graph) {
		this.dis = dis;
		this.graph = graph;
	}
	
	public void newGraph() {
		Digraph neGraph = new Digraph(new ArrayList<Adj>());
		List<Vertex> listaVertex = new ArrayList<>();
		Vertex ve = new Vertex();
		ve = graph.getAdjs().get(0).getV();
		
		listaVertex.add(ve);
		
		for(int i = 0; i < graph.getAdjs().get(0).getListArco().size(); i++) {
			
			if(dis > graph.getAdjs().get(0).getListArco().get(i).getDist()) {
				listaVertex.add(graph.getAdjs().get(0).getListArco().get(i).getW());
			}
			
		}
		
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
		graph = new Digraph(listAdj);
	}
	
	public void algDijgstra() {
		double valor = 300000;
		int vet = 0;
		Vertex lista[] = new Vertex[graph.getV()];
		double custo[] = new double[graph.getV()];
		
		for(int j = 0; j < custo.length; j++) {
			custo[j] = 300000;
			lista[j] = new Vertex();
		}
		custo[0] = 0;
		
		Vertex p = graph.getAdjs().get(0).getV();
		
		
		for (int i = 0; i < graph.getV(); i++) {
			
			lista[i] = p;
			if (i == 0) {
				custo[i] = i;
			}
			else
			custo[i] = valor;
			
			valor = 300000;
			
			for (int j = 0; j < graph.getAdjs().get(i).getListArco().size(); j++) {
				
				boolean verif = false;
				for (int h = 0; h < lista.length; h++) {
					if (lista[h].getNome() == graph.getAdjs().get(i).getListArco().get(j).getW().getNome()) {
						verif = true;
					}
				}
				
				if(verif != true) {
					if (valor > graph.getAdjs().get(i).getListArco().get(j).getDist()) {
						System.out.println(3);
						valor = graph.getAdjs().get(i).getListArco().get(j).getDist() + custo[i];
						p = graph.getAdjs().get(i).getListArco().get(j).getW();
						System.out.println(valor);
					}
				}
			}
		}
		
		for (int g = 0; g < lista.length; g++) {
			System.out.println(lista[g].getNome());
		}
		for (int y = 0; y < lista.length; y++) {
			System.out.println(custo[y]);
		}
		
	}
}
