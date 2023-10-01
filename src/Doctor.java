public class Doctor {
    int id;
    String name;
    String speciality;

    Doctor (String name) {
        System.out.println("El nombre asignado es: " + name);
        this.name = name;
        System.out.println("this name: " + this.name);
    }

    // Comportamientos
    public void showName () {
        System.out.println(this.name);
    }
}
