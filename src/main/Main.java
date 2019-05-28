package main;

import java.util.Scanner;

import algoritmo.Dijkstra;
import estrutura.GerarGraph;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Gerando grafo e adjacentes
		GerarGraph gg = new GerarGraph();
		gg.gerar();
		
		System.out.println("              -- FINDER --              ");
		System.out.println("        -- Best way to find you --              \n");
		
		int option = 0;
		do {
			System.out.println("1 - Verificar a distância de todos");
			System.out.println("2 - Verificar profissionais");
			System.out.println("0 - Sair");
			option = Integer.parseInt(scan.nextLine());
			switch(option) {
			case 1:
				gg.getDi().print();
				break;
			case 2:
				double distancia;
				System.out.print("\n   Digite o raio de distância em km: ");
				distancia = Double.parseDouble(scan.nextLine());
				
				Dijkstra dij = new Dijkstra(distancia, gg.getDi());
				dij.newGraph();
				dij.algDijgstra();
				
				break;
			}
		}while(option!=0);
	}
	
}
