
package IE351;

public class Pedido {
    private String articulo;
    private int unidades;
    private double precio;
    private double gastosEnvio;
    private double descuento;
    
    public Pedido(){
        articulo = "";
        unidades = 1;
        precio = 0;
        gastosEnvio = 3;
        descuento = 0;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    public double getTotalSinIva() {
        double TotalSinIva;
        TotalSinIva=(unidades*precio)+gastosEnvio;
        return TotalSinIva;
    }
    
    public double getIva() {
        double TotalSinIva = this.getTotalSinIva();
        double Iva;
        Iva = TotalSinIva * 0.16;
        return Iva;
    }
    
    public double getTotalMasIva() {
        double TotalSinIva = this.getTotalSinIva();
        double Iva = this.getIva();
        double TotalMasIva = TotalSinIva+Iva;
        return TotalMasIva;
    }
    
    public double getTotalDescuento() {
        double TotalMasIva=this.getTotalMasIva();
        double TotalDescuento = TotalMasIva*descuento/100;
        return TotalDescuento;
    }
    
    public double getTotalPedido(){
        double TotalMasIva=this.getTotalMasIva();
        double TotalDescuento = this.getTotalDescuento();
        double TotalPedido = TotalMasIva-TotalDescuento;
        return TotalPedido;
    }
}
