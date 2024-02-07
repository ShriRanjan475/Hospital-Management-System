import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hospital {
    private List<Patient> patients;
    private List<Appointment> appointments;

    public Hospital() {
        patients = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public void registerPatient() {
        Scanner scanner = new Scanner(System.in);
        Patient patient = new Patient();

        System.out.print("Enter patient name: ");
        patient.setName(scanner.nextLine());
        System.out.print("Enter patient age: ");
        patient.setAge(scanner.nextInt());
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter patient gender: ");
        patient.setGender(scanner.nextLine());
        System.out.print("Enter patient disease: ");
        patient.setDisease(scanner.nextLine());

        patients.add(patient);
        System.out.println("Patient registered successfully.");
    }

    public void scheduleAppointment() {
        Scanner scanner = new Scanner(System.in);
        Appointment appointment = new Appointment();

        System.out.print("Enter patient name for appointment: ");
        appointment.setPatientName(scanner.nextLine());
        System.out.print("Enter doctor name: ");
        appointment.setDoctorName(scanner.nextLine());
        System.out.print("Enter appointment date: ");
        appointment.setDate(scanner.nextLine());

        appointments.add(appointment);
        System.out.println("Appointment scheduled successfully.");
    }

    public void displayPatientInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String patientName = scanner.nextLine();

        for (Patient patient : patients) {
            if (patient.getName().equals(patientName)) {
                System.out.println("Patient Information:");
                System.out.println("Name: " + patient.getName());
                System.out.println("Age: " + patient.getAge());
                System.out.println("Gender: " + patient.getGender());
                System.out.println("Disease: " + patient.getDisease());
                return;
            }
        }

        System.out.println("Patient not found.");
    }
}