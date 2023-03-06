public class Main {
    private static AlumnoDao ald = new AlumnoDao();

    public static void main(String[] args) {
        ald.cleanAll();
        fill();
        System.out.println("Listado completo de Alumnos: ");
        ald.listarTodo();
        System.out.println("-----------------------------");
        System.out.println("Listado de Alumnos con alguna Asignatura Suspensa: ");
        ald.listarSuspensos();
        System.out.println("-----------------------------");
        ald.estadisticas();

    }

    public static void fill() {
        Alumno al = new Alumno();
        al.setNombre("Juanillo");
        al.setTlf("987876543");
        al.setEmail("Juanillo@mail.com");
        al.setGlobal_ad(5.0);
        al.setGlobal_di(8.0);
        ald.insertarAlumno(al);

        Alumno est = new Alumno();
        est.setNombre("Mariana");
        est.setTlf("123456789");
        est.setEmail("Mariana@mail.com");
        est.setGlobal_ad(7.5);
        est.setGlobal_di(9.0);
        ald.insertarAlumno(est);

        Alumno part = new Alumno();
        part.setNombre("Pedro");
        part.setTlf("555555555");
        part.setEmail("Pedro@mail.com");
        part.setGlobal_ad(4.0);
        part.setGlobal_di(7.5);
        ald.insertarAlumno(part);

        Alumno asp = new Alumno();
        asp.setNombre("Ana");
        asp.setTlf("111111111");
        asp.setEmail("Ana@mail.com");
        asp.setGlobal_ad(8.0);
        asp.setGlobal_di(2.5);
        ald.insertarAlumno(asp);

        Alumno apr = new Alumno();
        apr.setNombre("Lucia");
        apr.setTlf("222222222");
        apr.setEmail("Lucia@mail.com");
        apr.setGlobal_ad(7.0);
        apr.setGlobal_di(7.0);
        ald.insertarAlumno(apr);
    }
}
