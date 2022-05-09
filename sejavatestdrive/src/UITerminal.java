import java.util.Scanner;

public class UITerminal {
    private Account accObj;
    private String prompt;
    private String command;
    public Scanner sc = new Scanner(System.in);
    public Scanner scs = new Scanner(System.in);
    StoredFiles storedFiles = new StoredFiles();
    private int password;
   

    public void display_options(){ //Menu
        
        do{
            System.out.println("--------------MENU-----------");
            System.out.println("1. Create Account");
            System.out.println("2. Display all accounts");
            System.out.println("3. Search account");
            System.out.println("Choose option");
            int choose = scs.nextInt();
            String username_searched = null;
            switch(choose){
                case 1:
                    create_account_input();
                break;
                case 2:
                    storedFiles.get_all();
                break;
                case 3:
                System.out.println("Input username you want to search: ");
                username_searched = sc.nextLine();
                storedFiles.search(username_searched);
                break;
            }
            System.out.println("Back to Menu(Y/N) ?");
        }while(sc.nextLine().equalsIgnoreCase("y"));
    }

    public void handle_command(){

    }

    public void handle_inputs(){

    }

    public String getPrompt() { //cảnh báo, nhắc nhở
        return prompt;
    }

    public Account login_inputs(){
        Account account = null;
        System.out.println("User name:");
        String username = sc.nextLine();
        System.out.println("PassWord:");
        try{
            int password = scs.nextInt();
        }catch(Exception e){
            scs = new Scanner(System.in);
            System.out.println("Input by number please !!!");
            e.printStackTrace();
        }
        account = new Account(username, password);
        storedFiles.update(account);
        return account;
    }

    public Account create_account_input(){
        Account account = null;
        System.out.println("User name:");
        String username = sc.nextLine();
        System.out.println("PassWord:");
        try{
            int password = scs.nextInt();
        }catch(Exception e){
            scs = new Scanner(System.in);
            System.out.println("Input by number please !!!");
            e.printStackTrace();
        }
        System.out.println("Gmail:");
        String email = sc.nextLine();
        account = new Account(username, password, email);
        storedFiles.update(account);
        return account;
    }
}
