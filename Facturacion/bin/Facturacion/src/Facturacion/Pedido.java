package Facturacion;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int nroDePedido;
    private Cliente cliente; 
    private List<DetallePedido> items;

public Pedido(int nroDePedido, Cliente cliente, List<DetallePedido> items){
this.nroDePedido= nroDePedido;
this.cliente= cliente;
this.items= new ArrayList<DetallePedido>();
}

public void addDetallePedido(DetallePedido dp){
this.items.add(dp);
}

public Cliente getCliente(){
return cliente;
}

public int getNroDePedido(){
return nroDePedido;
}

public List<DetallePedido> getDetallePedido(){
return items;
}
}
