package algoritmo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import estrutura.Adj;
import estrutura.Digraph;
import estrutura.Vertex;

public class Dijkstra {
	double dis;
	String prof;
	Digraph graph = new Digraph(new ArrayList<Adj>());
	
	public Dijkstra(double dis, String prof, Digraph graph) {
		this.dis = dis;
		this.prof = prof;
		this.graph = graph;
	}
	
	public void newGraph() {
		Digraph neGraph = new Digraph(new ArrayList<Adj>());
		List<Vertex> listaVertex = new ArrayList<>();
		Vertex ve = new Vertex();
		ve = graph.getAdjs().get(0).getV();
		
		List<String> profs  = new ArrayList<String>();
		
		String name = "";
		for (int i =0; i < prof.length(); i++) {
			
			if ((prof.charAt(i)+"").equals(";")) {
				profs.add(name);
				name = "";
			}
			else {
				name = name + (prof.charAt(i)+"");
			}
		}
		
		
		listaVertex.add(ve);
		
		for(int i = 0; i < graph.getAdjs().get(0).getListArco().size(); i++) {
			boolean verif = false;
			
			if (profs.size() != 0) {
				for (int g = 0; g < profs.size(); g++) {
					if (profs.get(g) == graph.getAdjs().get(0).getListArco().get(i).getW().getProfissao()) {
						verif = true;
					}
				}
			} else {
				verif = true;
			}
			
			
			if(dis > graph.getAdjs().get(0).getListArco().get(i).getDist() && verif == true) {
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
			lista[j].setNome("aaa");
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
			
			boolean f = false;
			int x = 0;
			for (int v = 0; v < graph.getV() && f != true; v++) {
				if (lista[i].getNome().equals(graph.getAdjs().get(v).getV().getNome())) {
					f = true;
					x = v;
				}
			}
			
			for (int j = 0; j < graph.getAdjs().get(x).getListArco().size(); j++) {
				boolean verif = false;
				for (int h = 0; h < lista.length; h++) {
					if (lista[h].getNome() == graph.getAdjs().get(x).getListArco().get(j).getW().getNome() && verif != true) {
						verif = true;
					}
				}
				
				if(verif != true) {
					if (valor > graph.getAdjs().get(x).getListArco().get(j).getDist()) {
						valor = graph.getAdjs().get(x).getListArco().get(j).getDist() + custo[i];
						p = graph.getAdjs().get(x).getListArco().get(j).getW();
					}
				}
			}
			
		}
		
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		System.out.println("\n      Profissionais disponíveis nesse raio: "+(lista.length-1));
		System.out.println("\n      Profissionais: ");
		for(int k = 0; k < 1; k++) {
			for(int g = 0; g < graph.getAdjs().get(k).getListArco().size(); g++) {
				
				System.out.println("         "+graph.getAdjs().get(k).getListArco().get(g).getW().getNome()
						+" | "+graph.getAdjs().get(k).getListArco().get(g).getW().getProfissao()
						+" | Disponível: "+graph.getAdjs().get(k).getListArco().get(g).getW().getDisponibilidade()
						+" | Km de distância: "+df.format(graph.getAdjs().get(k).getListArco().get(g).getDist()));
			}
		}
		System.out.println("\n      Melhor rota: ");
		for(int b = 1; b < lista.length; b++) {
			System.out.println("         "+lista[b].getNome()+", quantidade de km: "+df.format(custo[b]));
		}
		System.out.println("\n\n");
		
	}
}
