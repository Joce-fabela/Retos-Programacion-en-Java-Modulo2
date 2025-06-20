public class OrdenPrototipo extends OrdenProduccion{
    String faseDesarrollo;

    public OrdenPrototipo(String codigo, int cantidad, String faseDesarrollo) {
        super(codigo, cantidad);
        this.faseDesarrollo = faseDesarrollo;
    }

    public void mostrarResumen() {
        System.out.println("\ud83e\uddea OrdenPrototipo - Código: " + this.codigo + " - Cantidad: " + this.cantidad + " - Fase: " + this.faseDesarrollo);
    }
}
