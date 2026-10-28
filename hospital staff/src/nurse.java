public class nurse extends medicalstaff{
    public nurse(String id, String name, String dept, int hours){
        super(id, name, dept, hours);
    }

    @Override
    public void performDuties() {
        System.out.println("Nurse " +name+ " monitors patients and gives medication.");
    }
}
