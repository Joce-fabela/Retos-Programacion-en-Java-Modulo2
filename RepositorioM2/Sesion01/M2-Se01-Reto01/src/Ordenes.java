import java.io.PrintStream;
import java.util.List;
import java.util.Objects;

public class Ordenes {
    public Ordenes() {

    }

    public void mostrarOrdenes(List<? extends OrdenProduccion > lista) {
            System.out.println();
            lista.forEach(OrdenProduccion::mostrarResumen);
        }

    public static void procesarPersonalizadas(List<? super OrdenPerzonalizada> lista, int costoAdicional) {
        System.out.println("\n\uD83D\uDCB0 Procesando órdenes personalizadas  ");


        for (Object obj : lista) {
            if (obj instanceof OrdenPerzonalizada op) {
                op.agregarCostoAdicional(costoAdicional);
                PrintStream var10000 = System.out;
                String var10001 = op.getCodigo();
                var10000.println(" ✅ Orden" + var10001 + "ajustada con costo adicional de $ " + costoAdicional);
            }
        }
    }
}

