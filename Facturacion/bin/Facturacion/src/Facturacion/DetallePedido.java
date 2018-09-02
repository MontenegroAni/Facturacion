package Facturacion;

public class DetallePedido {
	protected Producto producto;
	private int cantidad;

	public void setProducto(Producto p){
	this.producto = p;
	}

	public void setCantidad(int c){
	this.cantidad=c;
	}

	public double obtenerPrecioNeto(){
	    double precioNeto=0;
	    precioNeto+=this.producto.getPrecio()*this.cantidad;
	    return precioNeto;
	}

	public double obtenerPrecioUnitario(){
	    return this.producto.getPrecio();
	}

	public Producto getProducto(){
	return producto;
	}

	public int getCantidad(){
	return cantidad;
	}
}
