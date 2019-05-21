package estrutura;

import java.util.ArrayList;
import java.util.List;

public class Adj {
	
	Vertex v;
	List<Arco> listArco = new ArrayList<>();
	
	public Adj(Vertex v) {
		this.v = v;
	}
	
	public void gerarAdj(Vertex w) {
		
		CalcularDistancia calc = new CalcularDistancia();
		Double distancia = calc.getDistancia(v.getLatitude(), v.getLongetude(), w.getLatitude(), w.getLongetude());
		
		Arco arc = new Arco(v, w, distancia);
		listArco.add(arc);
	}

	public Vertex getV() {
		return v;
	}

	public void setV(Vertex v) {
		this.v = v;
	}

	public List<Arco> getListArco() {
		return listArco;
	}

	public void setListArco(List<Arco> listArco) {
		this.listArco = listArco;
	}

}
