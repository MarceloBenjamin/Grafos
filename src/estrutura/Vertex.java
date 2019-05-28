package estrutura;

public class Vertex {
	private String nome = "";
	private double latitude = 0;
	private double longetude = 0;
	private String profissao = "";
	private boolean disponibilidade;
	
	public Vertex() {
	}

	public Vertex(String nome, double latitude, double longetude, String profissao, boolean disponibilidade) {
		super();
		this.nome = nome;
		this.latitude = latitude;
		this.longetude = longetude;
		this.profissao = profissao;
		this.disponibilidade = disponibilidade;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongetude() {
		return longetude;
	}

	public void setLongetude(double longetude) {
		this.longetude = longetude;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public boolean getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
}
