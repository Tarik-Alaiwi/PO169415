public class AdminAuthentication implements Authentication{
    @Override
    public boolean login(String username, String password) {
        if(username.equals("admin") && password.equals("password")){
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
        if(username.equals("admin") && oldPassword.equals("password")){
            System.out.println("You're new password is: " + newPassword);
            return true;
        }
        return false;
    }
}
