import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        RecursoMedico recursoMedico = new RecursoMedico("Sala de cirujía");

        Runnable doctor1 = () -> recursoMedico.usar("Dra. Sánchez");
        Runnable doctor2 = () -> recursoMedico.usar("Dr. Gómez");

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        System.out.println("\uD83C\uDFE5 Iniciando acceso a la Sala de cirugía...");
        executorService.submit(doctor1);
        executorService.submit(doctor2);
    }
}