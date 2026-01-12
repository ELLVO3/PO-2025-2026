package zad5;

public class TestAuthentication {
    public static void main(String[] args) {
        Authentication user = new UserAuthentication();

        user.login("JanKowalski", "tajneHaslo");
        user.resetPassword("JanKowalski", "tajneHaslo", "noweHaslo123");
        user.logout();

        System.out.println();
        Authentication admin = new AdminAuthentication();

        admin.login("Admin", "admin");
        admin.resetPassword("Admin", "admin", "admin123");
        admin.logout();
    }
}
