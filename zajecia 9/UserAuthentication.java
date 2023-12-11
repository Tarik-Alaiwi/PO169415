public class UserAuthentication implements Authentication{

    @Override
    public boolean login(String username, String password) {
        if(username.equals("user") && password.equals("abba")){
            return true;
        }
        return false;
    }

    @Override
    public void logout() {
        System.out.println("You've been logged out.");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if(username.equals("user") && oldPassword.equals("abba")){
            System.out.println("You're new password is: " + newPassword);
            return true;
        }
        return false;
    }
}
