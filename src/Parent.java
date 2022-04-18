public class Parent extends Personne {
    private String email;
    public Parent(String nom , String prenom , String address , String mail){
        super(nom , prenom , address);
        this.email = mail;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
}
