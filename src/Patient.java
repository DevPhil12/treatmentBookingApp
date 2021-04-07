
public class Patient {
  private String username,name,address,telephone;
  public Patient(String username,String name, String address,String telephone){
  this.username=username;
  this.name=name;
  this.address=address;
  this.telephone=telephone;
  }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
  
}
