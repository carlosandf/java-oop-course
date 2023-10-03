import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Carlos Florez";
        myDoctor.showName();
        myDoctor.showId();
        //System.out.println(Doctor.id);


        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.showId();
        //System.out.println(Doctor.id);

        showMenu();
    }
}