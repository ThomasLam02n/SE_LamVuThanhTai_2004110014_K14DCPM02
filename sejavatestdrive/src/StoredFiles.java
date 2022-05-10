
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
        System.out.println("Account found out: ");
        for(Account account:memory){
            if(account.getUsername().equalsIgnoreCase(username_searched)){
                account1 = account;
                System.out.println(account1);
            }
        }
    }
     
}
