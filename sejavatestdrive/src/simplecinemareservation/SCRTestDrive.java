package simplecinemareservation;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class SCRTestDrive {
    public static void main(String[] args) {
        Account account = new Account();
        Account account2 = new Account();
        Account account3= new Account();

        account.create_account("LVTT", 123456, "LVTT@gmail.com");
        account2.create_account("QQQQ", 654321, "QQQQ@gmail.com");
        account3.create_account("RRRR", 135246, "RRRR@gmail.com");

        List<Account> listAccounts = new ArrayList<>();
        listAccounts.add(account);
        listAccounts.add(account2);
        listAccounts.add(account3);

        Gson gson = new Gson();
        try(FileWriter writer = new FileWriter("account.json")){
            gson.toJson(listAccounts, writer);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
