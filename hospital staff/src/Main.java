public class Main {
    public static void main(String[] args) {
        medicalstaff[] stafflist = new medicalstaff[4];
        stafflist[0] = new doctor("D001", "Okello", "General Medication", 40);
        stafflist[1] = new nurse("N001", "Nakato", "Maternity", 42);
        stafflist[2] = new pharmacist("P001", "Mugisha", "Pharmacy", 38);
        stafflist[3] = new doctor("L001", "Namutebi", "Laboratory", 40);

        System.out.println("=== Hospital Staff===");
        for (medicalstaff staff : stafflist) {
            staff.displayInfo();
            staff.performDuties();
            System.out.println();
        }
    }
}
