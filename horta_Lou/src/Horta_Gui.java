import java.util.ArrayList;

public class Horta_Gui {
	private String nome;
	private String localização;
	private ArrayList <Talhão> talhoes;
	
	public Horta_Gui(String nome, String localização) {
		this.talhoes = new ArrayList<>();
		this.nome = nome;
		this.localização = localização;
	}

	public String getNome() {
		return nome;
	}

	public String getLocalização() {
		return localização;
	}
	
	public ArrayList<Talhão> getTalhoes() {
		return talhoes;
	}

	public void addTalhão(Talhão talhão) {
		talhoes.add(talhão);
	}
}
