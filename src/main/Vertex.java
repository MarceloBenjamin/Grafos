package main;

public class Vertex {
	private String nome;
	private String latitude;
	private String longetude;
	private String profissao;
	private boolean disponibilidade;
	
	public Vertex() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongetude() {
		return longetude;
	}

	public void setLongetude(String longetude) {
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
