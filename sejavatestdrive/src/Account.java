import java.util.Scanner;

public class Account {
    // atributes
    private String username;
    private int password;
    private String email;
    private Boolean loggedin;

    public static StoredFiles account = new StoredFiles();
    // methods

    public Account(String username, int password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Account(String username, int password) {
        this.username = username;
        this.password = password;
    }

    public Account(){}

    public void set_account(String username, int password) {
    }

    public String getUsername() {
        return this.username;
    }

    public int getPassword() {
        return password;
    }

    public void login(String username, int password) {
        this.username = username;
        this.password = password;
        check_loggedin();
        if (loggedin == true) {
            System.out.println("Login Success!!!");
        } else {
            System.out.println("Login Fail!!!");
            System.err.println("Your username or password wrong !!!");
        }
    }

    public void logout() {

    }

    public void create_account(String username, int password, String email) {
    
    }

    public static void account_valid(String username, String email) { // account còn hiệu lực
        
    }

    public boolean check_loggedin() {
        Account accounts = new Account();
        for(Account account1:account.memory){
            if(account1.getUsername().equals(username)){
                account1 = accounts;
                loggedin = true;
            }
        }
        return loggedin;
    }

}
