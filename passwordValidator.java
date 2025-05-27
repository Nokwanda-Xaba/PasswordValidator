public class passwordValidator{
    public static void main(String[]args){
        System.out.println(isPasswordSecure("Zibusisokamama"));
    }
    static Boolean isPasswordSecure(String password){
        if(password.length()<8){
            return false;
        }
        if(!password.matches(".*[a-z].*")){
            return false;
        }
        if (!password.matches(".*[A-Z].*")){
            return false;
        }
        if (!password.matches(".*\\d.*")){
            return false;
        }
        if (!password.matches(".*[!@#$%^*].*")){
            return false;
        }
        return true;
    }
}    

