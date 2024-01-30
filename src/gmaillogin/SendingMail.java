package gmaillogin;

public class SendingMail {
    public void sendMail(String toUser,String message) {
        String msg;
        GmailloginProcess gmailloginProcess = new GmailloginProcess();
        ToUser toUser1=new ToUser();
        Gmaillogin gmaillogin=new Gmaillogin();
        if(gmailloginProcess.login(gmaillogin)){

         toUser1.inbox=message;
         System.out.println(toUser1.inbox);
        }}
    public static void main(String[] args) {
        SendingMail sendingMail= new SendingMail();
        sendingMail.sendMail("jhbjdbh@gs.com","hi ");
    }
}
