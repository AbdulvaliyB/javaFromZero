package Three.four.homeWork.one;

import Three.four.homeWork.one.entity.User;
import Three.four.homeWork.one.exeption.AccessDeniedException;
import Three.four.homeWork.one.exeption.UserNotFoundException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        User user = getUserByLoginAndPassword(login, password);
        validateUser(user);
        System.out.println("Доступ предоставлен");

    }


    public static User[] getUsers() {
        User user1 = new User("a", "a@gmail.com", "1234", 17);
        User user2 = new User("b", "b@gmail.com", "pass", 16);
        User user3 = new User("c", "c@gmail.com", "pass", 22);
        User user4 = new User("d", "d@gmail.com", "5678", 24);
        return new User[]{user1, user2, user3, user4};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) throw new AccessDeniedException("You are under 18 years old");
    }


}
