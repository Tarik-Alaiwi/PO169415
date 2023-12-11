public class AuthenticationTest {
    public static void main(String[] args){
        var a = new UserAuthentication();
        System.out.println(a.login("user", "abba"));
        a.logout();
        System.out.println(a.resetPassword("user", "abba", "baab"));

        var b = new AdminAuthentication();
        System.out.println(b.login("user", "abba"));
        b.logout();
        System.out.println(b.resetPassword("admin", "password", "baab"));
    }
}
