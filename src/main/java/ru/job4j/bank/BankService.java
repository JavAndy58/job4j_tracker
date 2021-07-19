package ru.job4j.bank;

import java.util.*;
import java.util.stream.Stream;

/**
 * Класс описывает работу простейших банковских операций. Перевод средств пользователей
 * с счета на счет, с подсчетом баланса.
 * @author Andrey
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение задания осуществляется в коллекции типа Map
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя и добавляет его в коллекцию.
     * Если пользователь есть, добавляется данные о новом счете.
     * @param user пользователь который добавляется в коллекцию
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод принимает на вход данные пользователя и данные банк. счета.
     * Если пользователь имеется в коллекции и счета входного нет у него,
     * то данные нового счета добавляются в коллекцию.
     * @param passport данные пользователя
     * @param account данные банковского счета
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
                List<Account> accounts = users.get(user.get());
                if (!accounts.contains(account)) {
                    accounts.add(account);
                }
        }
    }

    /**
     * Метод принимает на вход данные пользователя, по которым производится
     * поиск пользователя в колекции.
     * @param passport данные пользователя
     * @return возвращает пользователя из коллекции или null если пользователя нет
     */
    public Optional<User> findByPassport(String passport) {
        Stream<User> stream = users.keySet().stream();
        return stream.filter(e -> e.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод принимает на вход данные пользователя и номер банковского счета.
     * Метод производит поиск данных счета по данным пользователя и банк. реквизитам.
     * @param passport данные пользователя
     * @param requisite номер банковского счета
     * @return возвращается банковский аккаунт пользователя
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> account = Optional.empty();
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            account = users.get(user.get())
                    .stream()
                    .filter(e -> e.getRequisite().equals(requisite))
                    .findFirst();
        }
        return account;
    }

    /**
     * Метод позволяет переводить средства с счета на счет, проверяя наличия этих средств на счете.
     * @param srcPassport данные пользователя счета с которого списываются средства
     * @param srcRequisite номер счета с которого списываются средства
     * @param destPassport данные пользователя счета на который поступают средства
     * @param destRequisite номер счета на который поступают средства
     * @param amount размер средств которые переводятся с счета на счет
     * @return возвращается булевое значение true при удачном переводе и false при неудаче.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> accountSrc = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> accountDest = findByRequisite(destPassport, destRequisite);
        if (accountSrc.isPresent() && accountSrc.get().getBalance() >= amount && accountDest.isPresent()) {
            accountSrc.get().setBalance(accountSrc.get().getBalance() - amount);
            accountDest.get().setBalance(accountDest.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
