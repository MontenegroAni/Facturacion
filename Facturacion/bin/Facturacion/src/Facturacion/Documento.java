package Facturacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Documento {
	protected int nro, codigoEmision;
	protected Date fechaEmision;
	protected char letra;
	protected Cliente cliente;
	protected List<DetallePedido> items;

	public Documento(int nro, Date fechaEmision, int codigoEmision, char letra, Cliente cliente, List<DetallePedido> items){
	    this.nro= nro;
	    this.fechaEmision= fechaEmision;
	    this.codigoEmision= codigoEmision;
	    this.letra= letra;
	    this.cliente= cliente;
	    this.items= new ArrayList<>();
	}


	public char getLetra(){
	return letra;
	}

	public Date getFechaEmision(){
	return fechaEmision;
	}

	public int getNro(){
	return nro;
	}

	public int getCodigoEmision(){
	return codigoEmision;
	}

	public abstract double getTotal();
	}

