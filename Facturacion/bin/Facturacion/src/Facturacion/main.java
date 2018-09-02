package Facturacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class main {
	  public static void main(String[] args){
         // TODO code application logic here
        public List<Cliente> clientes;
        public List<Documento> documentos;
        public List<Factura> facturas;
        public List<NotaDeCredito> notasDeCredito;
        public List<Pedido> pedidos;
        public int ultimoNroFactura=0;
        public int ultimoNroNota=0;
        
        
        public TareaNueva(List<Documento> documentos, List<Cliente> clientes, List<Factura> facturas, List<Pedido> pedidos, List<NotaDeCredito> notasDeCredito){
            this.documentos= new ArrayList<>();
            this.facturas= new ArrayList<>();
            this.pedidos= new ArrayList<>();
            this.notasDeCredito= new ArrayList<>();
            this.clientes= new ArrayList<>();
            
        }
        
        public void Facturacion(List<Pedido> pedidos){
            Factura f = null;
            for(Pedido p: pedidos){
                ultimoNroFactura = ultimoNroFactura + 1;
                f= new Factura(ultimoNroFactura, new Date(), f.getCodigoEmision(), f.getLetra(), p.getCliente(), p.getDetallePedido());
                facturas.add(f);
            }
        }
        
        public void AnularFactura(List<Factura> facturas){
            NotaDeCredito ndc = null;
            for(Factura f: facturas){
                ultimoNroNota = ultimoNroNota + 1;
                ndc= new NotaDeCredito(ultimoNroNota, new Date(), ndc.getCodigoEmision(), ndc.getLetra(), ndc.cliente, ndc.items);
                notasDeCredito.add(ndc);
                this.documentos.remove(f);
                this.documentos.add(ndc);
            }
        }
        
        public void InformeDiario(){
            for(Documento d: documentos){
                System.out.println("Informe Diario.\nCliente: "+d.cliente+ "\nTipo de documento: " +d.cliente.getTipoDeDocumento()+ "\n Letra: " +d.getLetra()+ "\nNúmero: " +d.getNro()+ "\nFecha de emisión: " +d.getFechaEmision()+ "\nMonto: " +d.getTotal());
            }
        
        }
	 }

}
