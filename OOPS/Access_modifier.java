package OOPS;

public class Access_modifier {
    
    public static void main(String[] args) {
        User MyAcc = new User();
        MyAcc.username  = "Ayan"; //can easyly change as it is in public 

       // MyAcc.password = "sfjeni";  

       
        //can not access as it is in private
    } 
}

class User{
    public String username;

    private String password;
}
