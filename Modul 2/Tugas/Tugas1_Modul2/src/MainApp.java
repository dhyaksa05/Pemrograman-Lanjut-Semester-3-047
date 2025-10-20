// Class Doctor
class Doctor {
    private static final double BONUS_RATE = 0.08;
    private String name;
    private int id;
    private double salary;
    private String specialization;

    // Constructor
    public Doctor(String name, int id, double salary, String specialization) {
        this.setName(name);
        this.id = id;
        this.salary = salary;
        this.specialization = specialization;
    }

    public void applyBonus() {
        salary += calculateBonus();
        System.out.println("Bonus applied! New Salary : " + salary);
    }


    private double calculateBonus() {
        double bonus = salary * BONUS_RATE;
        return bonus;
    }

    public void printDetails() {
        System.out.println("Doctor ID: " + id);
        System.out.println("Name: " + getName());
        System.out.println("Specialization: " + specialization);
        System.out.println("Salary: $" + salary);
    }

    // Update specialization
    public void updateSpecialization(String newSpecialization) {
        specialization = newSpecialization;
        System.out.println("Specialization updated to: " + specialization);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Class Patient
class Patient {
    public String name;
    public int recordNumber;
    public Doctor doctor;
    public String disease;

    // Constructor
    public Patient(String name, int recordNumber, Doctor doctor, String disease) {
        this.name = name;
        this.recordNumber = recordNumber;
        this.doctor = doctor;
        this.disease = disease;
    }

    public void printPatientDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Record Number: " + recordNumber);
        System.out.println("Disease: " + disease);
        System.out.println("Doctor in Charge: " + doctor.getName());
    }

    public void updateDisease(String newDisease) {
        disease = newDisease;
        System.out.println("Disease updated to: " + disease);
    }
}

// Class Hospital
class Hospital {
    public String hospitalName;
    public String address;
    public Patient patient;

    public Hospital(String hospitalName, String address, Patient patient) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.patient = patient;
    }

    public void printHospitalDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Address: " + address);
        patient.printPatientDetails();
    }
}

// Main Class
class MainApp {
}