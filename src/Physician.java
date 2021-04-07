
public class Physician {
    String name,expertise,dayAvailable,room;
    public Physician(String name, String expertise,String dayAvailable,String room)
    {
    this.name=name;
    this.expertise=expertise;
    this.dayAvailable=dayAvailable;
    this.room=room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getDayAvailable() {
        return dayAvailable;
    }

    public void setDayAvailable(String dayAvailable) {
        this.dayAvailable = dayAvailable;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
            
}
