package zad5;

public class AdminAuthentication implements Authentication{

    @Override
    public boolean login(String username, String password) {
        System.out.println("[ADMIN] Administrator " + username + " zalogowany. Pełne uprawnienia.");
        return true;
    }

    @Override
    public void logout() {
        System.out.println("[ADMIN] Administrator wylogowany.");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        System.out.println("[ADMIN] Hasło administratora zmienione w bezpieczny sposób.");
        return true;
    }
}
