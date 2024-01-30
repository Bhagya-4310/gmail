package gmaillogin;

public class GmailloginProcess {
    boolean login(Gmaillogin gmail){
        gmail.userName="bhagi.akkiraju@gmail.com";
        gmail.password="Karthikeya@8";
        String userName="bhagi.akkiraju@gmail.com";
        String password="Karthikeya@8";
        if(userName.equals(gmail.userName) &&  password.equals(gmail.password)){
            return true;
        }
        else{
            return false;
        }
    }
}