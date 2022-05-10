import java.util.Scanner;

public class UITerminal {
    private Account accObj;
    private String prompt;
    private String command;
    public Scanner sc = new Scanner(System.in);
    public Scanner scs = new Scanner(System.in);
    StoredFiles storedFiles = new StoredFiles();
    private int password;
    private String username;
   

    public void display_options(){ //Menu
        
        do{
            System.out.println("--------------MENU-----------");
            System.out.println("1. Create Account");
            System.out.println("2. Display all accounts");
            System.out.println("3. Search account");
            System.out.println("4. Login account");
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
                case 4:
                    login_inputs();
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

    public void login_inputs(){
        System.out.println("Username:");
        String usernameinput = sc.nextLine();
        System.out.println("Password:");
        int passwordinput = scs.nextInt();
        for(Account account : storedFiles.memory){
            if(account.getUsername().equals(usernameinput)){
                accObj = account;
                System.out.println("Login success");
            }else{
                System.out.println("Login Fail!!!");
                System.err.println("Your username or password wrong !!!");
            }
        }
    }

    public void create_account_input(){
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
        accObj = new Account(username, password, email);
        storedFiles.memory.add(accObj);
    }

    public void create_bait(){
        Account account = new Account();
        Account account2 = new Account();
        Account account3= new Account();
        Account account4= new Account();
         
        account.create_account("LVTT", 123456, "LVTT@gmail.com");
        account2.create_account("QQQQ", 654321, "QQQQ@gmail.com");
        account3.create_account("RRRR", 135246, "RRRR@gmail.com");
        account4.create_account("OOOO", 135246, "OOOO@gmail.com");
         
        storedFiles.memory.add(account);
        storedFiles.memory.add(account2);
        storedFiles.memory.add(account3);
        storedFiles.memory.add(account4);
    }
}
