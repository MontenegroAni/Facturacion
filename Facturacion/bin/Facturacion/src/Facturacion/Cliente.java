package Facturacion;

public class Cliente {
	private int nroDeCliente, nroDeDocumento;
	private String domicilio, condicionImpositiva, tipoDeDocumento;

	public Cliente(int nroDeCliente, int nroDeDocumento, String domicilio, String condicionImpositiva, String tipoDeDocumento){
	this.nroDeCliente= nroDeCliente;
	this.nroDeDocumento= nroDeDocumento;
	this.domicilio= domicilio;
	this.condicionImpositiva= condicionImpositiva;
	this.tipoDeDocumento= tipoDeDocumento;
	}

	public String getTipoDeDocumento(){
	return tipoDeDocumento;
	}

	public int getNroDeCliente(){
	return nroDeCliente;
	}

	public int getNroDeDocumento(){
	return nroDeDocumento;
	}

	public String getCondicionImpositiva(){
	return condicionImpositiva;
	}

	public String getDomicilio(){
	return domicilio;
	}

	public void setDomicilio(String d){
	this.domicilio=d;
	}


}
