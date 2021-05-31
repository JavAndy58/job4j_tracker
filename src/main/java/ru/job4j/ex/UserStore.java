package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (int index = 0; index < users.length; index++) {
            if (login.equals(users[index].getUsername())) {
                user = users[index];
                break;
            } else {
                throw new UserNotFoundException("Пользователь не найден");
            }
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = false;
        if (user.isValid() && user.getUsername().length() >= 3) {
            rsl = true;
        } else {
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
