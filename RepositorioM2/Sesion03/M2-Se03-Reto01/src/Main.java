import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos = List.of(
                new Pedido("Jocelyn", "Domicilio", "59-1858-3312"),
                new Pedido("Matias", "Local", "59-1965-9863"),
                new Pedido("Saul", "Domicilio", null)
        );

        System.out.println("✅ Confirmación de pedidos a domicilio:");
        //Iniciamos el Stream sobre la lista de pedidos
        pedidos.stream()
                .map(Pedido::getTelefono)
        //Fliter permite solo los Optional
                .filter(Optional::isPresent)
        //map extrae el valor de Optional
                .map(Optional::get)
                .map(tel -> "📞 Confirmación enviada al número:" + tel)
        //foreach imprime los valores
                .forEach(System.out::println);
    }
}