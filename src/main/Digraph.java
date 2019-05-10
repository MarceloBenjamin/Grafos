package main;

public class Digraph {
	
	private Integer v;
	private Arc matrix[][] = new Arc[0][0];
	
	public Digraph(Arc matrix[][]) {
		this.matrix = matrix;
		v = matrix.length;
	}

	public Integer getV() {
		return v;
	}

	public void setV(Integer v) {
		this.v = v;
	}

	public Arc[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(Arc[][] matrix) {
		this.matrix = matrix;
	}
}
