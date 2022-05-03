package simplecinemareservation;

public class Account {
    //atributes
    private String username;
    private int password;
    private String email;
    private Boolean loggedin;
    public StoredFiles account;
    //methods
    public void set_account(String username, int password){
        this.username = username;
        this.password = password;
    }

    public void login(String username, int password){
      
    }

    public void create_account(String username, int password, String email){
        this.set_account(username, password);
        this.email = email;
    }

    public void account_valid(String username, String email){

    }

    public boolean check_loggedin(){
        return loggedin;
    }
}
