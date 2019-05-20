package estrutura;

public class Arco {
	
	Vertex v = new Vertex();
	Vertex w = new Vertex();
	double dist;
	
	public Arco() {
	}
	
	public Arco(Vertex v, Vertex w, double dist) {
		this.v = v;
		this.w = w;
		this.dist = dist;
	}

	public Vertex getV() {
		return v;
	}

	public void setV(Vertex v) {
		this.v = v;
	}

	public Vertex getW() {
		return w;
	}

	public void setW(Vertex w) {
		this.w = w;
	}

	public double getDist() {
		return dist;
	}

	public void setDist(double dist) {
		this.dist = dist;
	}

}
