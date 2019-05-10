package main;

public class Arc {

	private String v;
	private String w;
	private Integer value;
	
	public Arc(Vertex v, Vertex w, int value) {
		this.v = v.getVer();
		this.w = w.getVer();
		this.value = value;
	}

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}

	public String getW() {
		return w;
	}

	public void setW(String w) {
		this.w = w;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}
