import java.util.List;

public class Main {
    public static void main(String[] args) {
    //Lista de sucursales con sus encuestas
        List<Sucursal> sucursales = List.of(
                new Sucursal("Centro", List.of(
                        new Encuesta("Alejandro", null, 4),
                        new Encuesta("Liz", "El tiempo de espera fue largo", 3),
                        new Encuesta("Maria", "null", 5),
                        new Encuesta("Laura", "La atención fue buena, pero la limpieza puede mejorar", 2)
                )),
                new Sucursal("Norte", List.of(
                        new Encuesta("Saul", null, 5),
                        new Encuesta("Antonio", null, 5)
                ))
        );

        //Procesamos todo de todas las sucursales
        sucursales.stream()
                .flatMap(sucursal ->
                                sucursal.getEncuestas().stream()
                                //Nos quedamos solo con las encuestas insatisfechas con calificación menos o igual a 3
                                        .filter(encuesta -> encuesta.getCalificacion() <= 3)
                                //Por cada encuesta filtrada obtenemos el comentario usando Optional permitiendo manejar comentarios null
                                        .flatMap(encuesta -> encuesta.getComentario()
                                //Este es en caso en el que aveces el comentario no sea null sino el texto null sea una cadena
                                                        .filter(c -> !c.equalsIgnoreCase("null")) // evita comentarios "null" como texto
                                //Transformamos cada comentario en un mensaje para el area, inlcuyend el nombre de la sucursal
                                                        .map(comentario ->
                                                                "Sucursal " + sucursal.getNombre() + ": Seguimiento a paciente con comentario: \"" + comentario + "\""
                                                        )
                                                        .stream()
                                        )
                )
                .forEach(System.out::println);
    }
}