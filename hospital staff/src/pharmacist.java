public class pharmacist extends medicalstaff{
    public pharmacist(String id, String name, String dept, int hours){
        super(id, name, dept, hours);
    }

    @Override
    public void performDuties() {
        System.out.println("Pharmacist " +name + " dispenses drugs and advises on dosage.");
    }
}
