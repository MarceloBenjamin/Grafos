package estrutura;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Digraph {
	
	private Integer v;
	private List<Adj> adjs = new ArrayList<Adj>();
	
	public Digraph(List<Adj> adjs) {
		this.v = adjs.size();
		this.adjs = adjs;
	}
	
	public void print() {
		for(int i = 0; i < adjs.size(); i++) {
			System.out.print("   "+adjs.get(i).v.getNome()+":\n");
			for (int j = 0; j < adjs.get(i).getListArco().size(); j++) {
				DecimalFormat df = new DecimalFormat("###,##0.00");
				
				System.out.print("   "+adjs.get(i).getListArco().get(j).getV().getNome()+
						" - "+df.format(adjs.get(i).listArco.get(j).dist)+
						" Km - "+adjs.get(i).getListArco().get(j).getW().getNome()+"\n");
			}
			System.out.print("\n");
		}
	}

	public Integer getV() {
		return v;
	}

	public void setV(Integer v) {
		this.v = v;
	}

	public List<Adj> getAdjs() {
		return adjs;
	}

	public void setAdjs(List<Adj> adjs) {
		this.adjs = adjs;
	}

}
