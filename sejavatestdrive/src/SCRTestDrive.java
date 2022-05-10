

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class SCRTestDrive {
    public static void main(String[] args) {

        Account account = new Account();
        Account account2 = new Account();
        Account account3= new Account();
        Account account4= new Account();

        account.create_account("LVTT", 123456, "LVTT@gmail.com");
        account2.create_account("QQQQ", 654321, "QQQQ@gmail.com");
        account3.create_account("RRRR", 135246, "RRRR@gmail.com");
        account4.create_account("OOOO", 135246, "OOOO@gmail.com");

        List<Account> list = new ArrayList<>();
        list.add(account);
        list.add(account2);
        list.add(account3);
        list.add(account4);

        Gson gson = new Gson();
        try(FileWriter writer = new FileWriter("account.json")){
            gson.toJson(list, writer);
        }catch(Exception e){
            e.printStackTrace();
        } 

     /*    try(Reader fileReader = Files.newBufferedReader(Paths.get("account.json"))){
            System.out.println(fileReader);
        }catch (Exception e) {
            e.printStackTrace();
        } */
/* 
      UITerminal uiTerminal = new UITerminal();
      uiTerminal.create_bait();
      uiTerminal.display_options(); */
      
       /*  StoredFiles storedFiles = new StoredFiles();
        Account account = new Account();
        account.create_account("LVTT", 123456, "LVTT@gmail.com");
        storedFiles.update(account);
        System.out.println(storedFiles.list);
        storedFiles.write(); */

  }
}