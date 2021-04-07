
public class Appointment {
    String physicianName,treatmentType,patientName,patientType,time,room,status;
    public Appointment(String physicianName, String treatmentType,String patientName,String patientType,String time, String room, String status)
    {
    this.physicianName=physicianName;
    this.treatmentType=treatmentType;
    this.patientName=patientName;
    this.patientType=patientType;
    this.time=time;
    this.room=room;
    this.status=status;
    }

    public String getPhysicianName() {
        return physicianName;
    }

    public void setPhysicianName(String physicianName) {
        this.physicianName = physicianName;
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(String treatmentType) {
        this.treatmentType = treatmentType;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
