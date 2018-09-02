package Facturacion;

import java.util.Date;
import java.util.List;

public class Factura extends Documento{

public Factura(int nro, Date fechaEmision, int codigoEmision, char letra, Cliente cliente, List<DetallePedido> items){
super(nro, fechaEmision, codigoEmision, letra, cliente, items);
}

public float getPrecioDeVenta(){
float precioDeVenta=0;
for(DetallePedido dp: items){
    switch (this.letra) {
        case 'A':
            precioDeVenta+=dp.obtenerPrecioNeto()+((10.05*dp.obtenerPrecioNeto())/100);
            break;
        case 'B':
            precioDeVenta+=dp.obtenerPrecioNeto()+((dp.obtenerPrecioNeto()*21)/100);
            break;
        case 'X':
            precioDeVenta+=dp.obtenerPrecioNeto()+((dp.obtenerPrecioNeto()*70)/100);
            break;
        default:
            break;
        }
    }
return precioDeVenta;
}

public float calcularMontoIVA(){
float montoIVA=0;
for(DetallePedido dp: items){
    switch (this.letra) {
        case 'A':
            montoIVA+=(dp.obtenerPrecioNeto()*10.05)/100;
            break;
        case 'B':
            montoIVA+=(dp.obtenerPrecioNeto()*21)/100;
            break;
        case 'X':
            montoIVA+=(dp.obtenerPrecioNeto()*70)/100;
            break;
        default:
            break;
    }
}
return montoIVA;
}

public float calcularIVAdelTotal(){
float totalIVA=0;
        switch (this.letra) {
            case 'A':
                totalIVA+=(this.getTotal()*10.05)/100;
                break;
            case 'B':
                totalIVA+=(this.getTotal()*21)/100;
                break;
            case 'X':
                totalIVA+=(this.getTotal()*70)/100;
                break;
            default:
                break;
        }
return totalIVA;
}

@Override
public double getTotal(){
    //comentario. CON IVA INCLUIDO
double total=0;
       for(DetallePedido dp: items){
           total+=this.getPrecioDeVenta();
       }
return total;
}
}
