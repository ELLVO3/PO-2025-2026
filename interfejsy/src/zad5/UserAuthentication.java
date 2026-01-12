package zad5;

public class UserAuthentication implements Authentication{

    @Override
    public boolean login(String username, String password) {
        System.out.println("Użytkownik " + username + " zalogowany.");
        return true;
    }

    @Override
    public void logout() {
        System.out.println("Wylogowano.");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        System.out.println("Hasło użytkowanika " + username + " zostało pomyślnie zmienione.");
        return true;
    }
}
