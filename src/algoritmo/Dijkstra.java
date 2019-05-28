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
		double valor = 30000;
		int vet = 0;
		double lista[] = new double[graph.getV()];
		double custo[] = new double[graph.getV()];
		
		for(int j = 0; j < custo.length; j++) {
			custo[j] = 30000;
		}
		
		lista[vet] = 0;
		
		for(int i = 0; i < graph.getV(); i++) {
			for(int k = 0; k < graph.getAdjs().get(i).getListArco().size(); k++) {
				if (valor > graph.getAdjs().get(i).getListArco().get(k).getDist()) {
					valor = graph.getAdjs().get(i).getListArco().get(k).getDist();
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
