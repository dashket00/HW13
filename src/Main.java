import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static boolean avtorization (String login, String password, String confirmPassword){

        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static void validateLogin(String login) throws WrongLoginException {
        if (login.length() >= 20 & login.contains(" ")) {
            throw new WrongLoginException("Неверный логин. Логин должен содержать не более 20 символов и должен содержать пробел");
        }
    }

    private static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() >= 20 & password.contains(" ") || !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Невеный пароль. Пароль должен содержать не менее 20 символов, должен содержать пробел, хотя бы одну цифру и должен совпадать с подтвержденным паролем.");
        }
    }

    public static void main(String[] args) {
        String login = "user123";
        String password = "Passw01rd";
        String confirmPassword = "Passw01rd";

        if (avtorization(login, password, confirmPassword)) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed.");
        }
    }
}

