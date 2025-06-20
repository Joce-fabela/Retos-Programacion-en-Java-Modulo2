import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Ordenes ordenes = new Ordenes();

        //Ordenes de producion de masa
        OrdenMasa ordenM1 = new OrdenMasa("A1739", 500);
        OrdenMasa ordenM2 = new OrdenMasa("A4851", 750);

        List<OrdenMasa> listaMasa = new ArrayList();
        listaMasa.add(ordenM1);
        listaMasa.add(ordenM2);

        OrdenPerzonalizada ordenP1 = new OrdenPerzonalizada("P459", 100, "ClienteX");
        OrdenPerzonalizada ordenP2 = new OrdenPerzonalizada("P789", 150, "ClienteY");

        List<OrdenPerzonalizada> listaPersonas = new ArrayList();
        listaPersonas.add(ordenP1);
        listaPersonas.add(ordenP2);

        OrdenPrototipo ordenPro1 = new OrdenPrototipo("T789", 10, "Fase: Diseño ");
        OrdenPrototipo ordenPro2 = new OrdenPrototipo("T790", 15, "Fase: Pruebas ");

        List<OrdenPrototipo> listaPrototipo = new ArrayList();
        listaPrototipo.add(ordenPro1);
        listaPrototipo.add(ordenPro2);


        System.out.println("\uD83D\uDCCB Órdenes registradas: ");
        ordenes.mostrarOrdenes(listaMasa);

        System.out.println("📋 Órdenes registradas: ");
        ordenes.mostrarOrdenes(listaPrototipo);

        System.out.println("\uD83D\uDCCB Órdenes registradas: ");
        ordenes.mostrarOrdenes(listaPersonas);
        Ordenes.procesarPersonalizadas(listaPersonas, 200);

        System.out.println("📊 Resumen total de órdenes: ");
        System.out.println("🔧 Producción en masa: " + listaMasa.size());
        System.out.println("🛠️ Personalizadas: " + listaPersonas.size());
        System.out.println("🧪 Prototipos: " + listaPrototipo.size());
    }
}