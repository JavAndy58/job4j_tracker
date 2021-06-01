package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User userTemp = null;
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                userTemp = user;
                break;
            }
        }
        if (userTemp == null) {
            throw new UserNotFoundException("Пользователь не найден");
        }
        return userTemp;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = false;
        if (user.isValid() && user.getUsername().length() >= 3) {
            rsl = true;
        }
        if (rsl = false) {
            throw new UserInvalidException("Пользователь не валидный");
        }
        return rsl;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", false)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ee) {
            ee.printStackTrace();
        } catch (UserNotFoundException ea) {
            ea.printStackTrace();
        }
    }
}
