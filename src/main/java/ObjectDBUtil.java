import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObjectDBUtil {
    private static EntityManagerFactory ETM;

    static {
        try {

            ETM = Persistence.createEntityManagerFactory("colegio.odb");
            System.out.println("Conexión realizada con exito");
        } catch (Exception ex) {
            System.out.println("Hubo error al iniciar en entityManager");
            System.out.println(ex);
        }
    }

    public static EntityManagerFactory getETM() {
        return ETM;
    }
}
