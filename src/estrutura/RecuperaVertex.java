package estrutura;

import java.util.ArrayList;
import java.util.List;

public class RecuperaVertex {
	private String dados;

	public RecuperaVertex(String dados) {
		this.dados = dados;
	}
	
	public List<Vertex> retornaDados() {
		List<Vertex> veLista = new ArrayList<>();
		Vertex ve = new Vertex();
		String value = "";
		int count = 0;
		int set = 0;
		
		Vertex ver = new Vertex("Agente", -15.836073, -47.912019, "", false);
		veLista.add(ver);
		
		for(int i = 0; i < dados.length(); i++) {
			
			if((dados.charAt(i)+"").equals(";") || (dados.charAt(i)+"").equals(",")) {
				
				if (count == 0) {					
					ve.setNome(value);
					value = "";
					count++;
				} else
				if (count == 1) {
					ve.setLatitude(Double.parseDouble(value));
					value = "";
					count++;
				} else
				if (count == 2) {
					ve.setLongetude(Double.parseDouble(value));
					value = "";
					count++;
				} else
				if (count == 3) {
					ve.setProfissao(value);
					value = "";
					count++;
				} else
				if (count == 4) {
					if(set > 0) {
						String newValue = "";
						for(int k =2; k < ve.getNome().length(); k++) {
							newValue += ve.getNome().charAt(k);
						}
						ve.setNome(newValue);
					}
					set = 1;
					ve.setDisponibilidade(Boolean.parseBoolean(value));
					value = "";
					
					veLista.add(new Vertex(ve.getNome(),ve.getLatitude(),ve.getLongetude(),ve.getProfissao(),ve.getDisponibilidade()));
					
					count = 0;
				}
				
			} else if((dados.charAt(i)+"").equals(" ")) {
			} else {
				if ((dados.charAt(i)+"").equals("_")) {
					value += " ";
				} else
				value += (dados.charAt(i)+"");
			}
		}
		
		return veLista;
	}

}
