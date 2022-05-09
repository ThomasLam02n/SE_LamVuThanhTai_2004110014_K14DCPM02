
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

public class StoredFiles {
    private String stored_file;
    List<Account> memory = new ArrayList<Account>();

    Scanner sc = new Scanner(System.in);

    public StoredFiles(String string) {
    }

    public StoredFiles() {
    }

    public void read() {
   
    }

    public void write() {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter("account.json")) {
            gson.toJson(memory, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Account account) {
        memory.add(account);
    }

    public void get_all() {
        System.out.println(memory);
    }

    public void search(String username_searched) {
        Account account1 = null;
        for(Account account:memory){
            if(account.getUsername().equalsIgnoreCase(username_searched)){
                account1 = account;
                System.out.println("Account found out: ");
                System.out.println(account1);
            }
        }
    }

    /*
     * public void moi(){
     * Account account = new Account();
     * Account account2 = new Account();
     * Account account3= new Account();
     * Account account4= new Account();
     * 
     * account.create_account("LVTT", 123456, "LVTT@gmail.com");
     * account2.create_account("QQQQ", 654321, "QQQQ@gmail.com");
     * account3.create_account("RRRR", 135246, "RRRR@gmail.com");
     * account4.create_account("OOOO", 135246, "OOOO@gmail.com");
     * 
     * memory.add(account);
     * memory.add(account2);
     * memory.add(account3);
     * memory.add(account4);
     * }
     */
}
