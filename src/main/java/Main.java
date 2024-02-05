public class Main {
    public static void main(String[] args) {
        try {
            checkAccount("awdawd", "awd", "awd");
        } catch (WrongLoginException | WrongPasswordException w) {
            System.out.println(w.getMessage());
        }
    }

    public static void checkAccount(String login, String password, String confirmPassword) {
        String regex = "([a-zA-Z\\d+_]{3,20}+)";

        if (!login.matches(regex)) {
            throw new WrongLoginException("Ошибка ввода логина!");
        }
        if (!password.matches(regex)) {
            throw new WrongPasswordException("Ошибка ввода пароля!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Ошибка ввода пароля!");
        }
    }
}