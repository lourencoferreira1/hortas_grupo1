

import java.time.LocalDate;



public class Plantacao {
	
	private LocalDate dataSementeira;
    private String tipoCultura;

    public Plantacao(LocalDate dataSementeira, String tipoCultura) {
        this.dataSementeira = dataSementeira;
        this.tipoCultura = tipoCultura;
    }

	/**
	 * @return the dataSementeira
	 */
	public LocalDate getDataSementeira() {
		return dataSementeira;
	}

	/**
	 * @param dataSementeira the dataSementeira to set
	 */
	public void setDataSementeira(LocalDate dataSementeira) {
		this.dataSementeira = dataSementeira;
	}

	/**
	 * @return the tipoCultura
	 */
	public String getTipoCultura() {
		return tipoCultura;
	}

	/**
	 * @param tipoCultura the tipoCultura to set
	 */
	public void setTipoCultura(String tipoCultura) {
		this.tipoCultura = tipoCultura;
	}

	@Override
	public String toString() {
		return "Plantacao_de_batata [dataSementeira=" + dataSementeira + ", tipoCultura=" + tipoCultura + "]";
	}
}

