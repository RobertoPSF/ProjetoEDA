import java.io.Serializable;

public class Dados implements Serializable {
	private static final long serialVersionUID = 1L;
	private String semanaEpidemologica;
    private String data;
    private String dias;
    private String estado;
    private String cidade;
    private String codigoIbge;
    private String tipoDeLocal;
    private int confirmados;
    private String confirmadosPor100k;
    private int confirmacaoDia;
    private int obitosAcumulados;
    private int obitosDia;
    private double obitosConfirmados;
    private String populacao;
    private String ultimo;
    private String repetido;
	
	public Dados() {
		
	}

	public Dados(String semanaEpidemologica, String data, String dias, String estado, String cidade, String codigoIbge, 
    String tipoDeLocal, int confirmados, String confirmadosPor100k, int confirmacaoDia, int obitosAcumulados, int obitosDia, 
    double obitosConfirmados, String populacao, String ultimo, String repetido) {
		super();
		this.semanaEpidemologica  = semanaEpidemologica;
		this.data = data;
		this.dias = dias;
		this.estado = estado;
		this.cidade = cidade;
		this.codigoIbge = codigoIbge;
		this.tipoDeLocal = tipoDeLocal;
		this.confirmados = confirmados;
		this.confirmadosPor100k = confirmadosPor100k;
		this.confirmacaoDia= confirmacaoDia;
		this.obitosAcumulados = obitosAcumulados;
		this.obitosDia = obitosDia;
		this.obitosConfirmados = obitosConfirmados;
		this.populacao = populacao;
		this.ultimo = ultimo;
		this.repetido = repetido;
	}

	
	public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getSemanaEpidemologica() {
        return semanaEpidemologica;
    }

    public String getData() {
        return data;
    }

    public String getDias() {
        return dias;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCodigoIbge() {
        return codigoIbge;
    }

    public String getTipoDeLocal() {
        return tipoDeLocal;
    }

    public int getConfirmados() {
        return confirmados;
    }

    public void setConfirmados(int confirmados) {
        this.confirmados = confirmados;
    }

    public String getConfirmadosPor100k() {
        return confirmadosPor100k;
    }

    public int getConfirmacaoDia() {
        return confirmacaoDia;
    }

    public int getObitosAcumulados() {
        return obitosAcumulados;
    }

    public void setObitosAcumulados(int obitosAcumulados) {
        this.obitosAcumulados = obitosAcumulados;
    }

    public int getObitosDia() {
        return obitosDia;
    }

    public double getObitosConfirmados() {
        return obitosConfirmados;
    }

    public String getPopulacao() {
        return populacao;
    }

    public String getUltimo() {
        return ultimo;
    }

    public String getRepetido() {
        return repetido;
    }

    @Override
	public String toString() {
		String saida = String.format("%s;", semanaEpidemologica)+String.format("%s;", data)
		+String.format("%s;", dias)+String.format("%s;", estado)
		+String.format("%s;", cidade)+String.format("%s;", codigoIbge)
		+String.format("%s;", tipoDeLocal)+String.format("%d;", confirmados)
		+String.format("%s;", confirmadosPor100k)+String.format("%d;", confirmacaoDia)
		+String.format("%d;", obitosAcumulados)+String.format("%d;", obitosDia)
		+String.format("%f;", obitosConfirmados)+String.format("%s;", populacao)
		+String.format("%s;", ultimo)+String.format("%s;\n", repetido);
		return saida;
	}

	
	
	
	
}