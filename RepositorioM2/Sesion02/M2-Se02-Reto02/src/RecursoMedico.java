import java.util.concurrent.locks.ReentrantLock;

public class RecursoMedico {
    private String nombre;
    private final ReentrantLock lock = new ReentrantLock();

    //Constructor
    public RecursoMedico(String nombre){
        this.nombre = nombre;
    }

    //Método usar
    public void usar(String profesional){

        lock.lock();
        try{
            System.out.println("👩🏻‍⚕️" + profesional + " ha ingresado a Sala de cirugía");
            Thread.sleep(1000);
            System.out.println("✅" + profesional + " ha salido de Sala de cirugía");
        } catch (InterruptedException e) {
            System.out.println("⚠️" + profesional + " fue interrumpido");
        } finally {
            lock.unlock();
        }

    }
}