public class OrdenPerzonalizada extends OrdenProduccion {
    String cliente;
    private int costoAdicional = 0;

    public OrdenPerzonalizada(String codigo, int cantidad, String cliente){
        super(codigo, cantidad);
        this.cliente = cliente;
    }

    public void agregarCostoAdicional(int costo) {
        this.costoAdicional += costo;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public void mostrarResumen(){
        System.out.println("\uD83D\uDEE0\uFE0F OrdenPersonalizada - Código: " + this.codigo + "- Cantidad: " + this.cantidad  + "- Cliente: " + this.cliente);
    }
}
