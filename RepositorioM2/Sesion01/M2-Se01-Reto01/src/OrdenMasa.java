public class OrdenMasa extends OrdenProduccion {
    public OrdenMasa (String codigo, int cantidad) {
        super (codigo, cantidad);
    }

    public void mostrarResumen() {
        System.out.println("\uD83D\uDD27 OrdenMasa - Código: " + this.codigo + "- Cantidad: " + this.cantidad);
    }
}
