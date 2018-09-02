package Facturacion;

import java.util.Date;
import java.util.List;

public class NotaDeCredito extends Documento{
	public NotaDeCredito(int nro, Date fechaEmision, int codigoEmision, char letra, Cliente cliente, List<DetallePedido> items){
		super(nro, fechaEmision, codigoEmision, letra, cliente, items);
		}

		public double getPrecio(){
		    double precio=0;
		    for(DetallePedido dp: items){
		        switch(this.letra){
		            case 'A':
		                precio+=dp.obtenerPrecioNeto()+((10.05*dp.obtenerPrecioNeto())/100);
		                break;
		            case 'B':
		                precio+=dp.obtenerPrecioNeto()+((21*dp.obtenerPrecioNeto())/100);
		                break;
		            case 'X':
		                precio+=dp.obtenerPrecioNeto()+((70*dp.obtenerPrecioNeto())/100);
		                break;
		            default:
		                break;
		        }
		    }
		    return precio;
		}

		@Override
		public double getTotal(){
		    double total=this.getPrecio();
		    return total;
		}
}
