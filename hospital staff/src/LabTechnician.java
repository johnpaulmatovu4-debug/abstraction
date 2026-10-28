public class LabTechnician extends medicalstaff{
    public LabTechnician(String id, String name, String dept, int hours){
        super(id, name, dept, hours);
    }

    @Override
    public void performDuties() {
        System.out.println("Lab Technician " +name+ " tests blood and other samples.");
    }
}
