package modele.entities;

public class utilisateur {
	private int id;
    private String email;
    private String password;
    
    public utilisateur() {
   }

    public utilisateur(String email,String password) {
    	 this.email = email;
    	 this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;}

  

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

