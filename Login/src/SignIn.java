public class SignIn {

    public void SignIn(String Password, String ConfirmPassword, String Login){
        try {
            boolean valid = Login.matches("\\w+");
            boolean validPass = Password.matches("\\w+");
            if ((valid != true) ^ (Login.length() >= 20)) throw new WrongLoginException();
            if ((validPass != true) | (Login.length() >= 20) | !(Password.equals(ConfirmPassword))) throw new WrongPasswordException();
            System.out.println(true);
        }
        catch (WrongLoginException a){
            System.out.println("Login " + false);
        }
        catch (WrongPasswordException e){
            System.out.println("Password " + false);
        }
    }
}
