package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
//        if (!users.containsKey(user)) {
//            users.put(user, new ArrayList<Account>());
//        }
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        for (User key : users.keySet()) {
            if (key.equals(user)) {
                List<Account> accounts = users.get(key);
                if (!accounts.contains(account)) {
                    accounts.add(account);
                    break;
                }

            }

        }
    }

    public User findByPassport(String passport) {
        User user = null;
        for (User key : users.keySet()) {
            if(key.getPassport().equals(passport)) {
                user = key;
                break;
            }
        }
        return user;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account accountTemp = null;
        User user = findByPassport(passport);
        for (User key : users.keySet()) {
            if (key.equals(user)) {
                List<Account> accounts = users.get(key);
                for (Account account : accounts) {
                    if (account.getRequisite().equals(requisite)) {
                        accountTemp = account;
                    }
                }
            }
        }
        return accountTemp;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account accountSrc = findByRequisite(srcPassport,srcRequisite);
        Account accountDest = findByRequisite(destPassport, destRequisite);
        if (accountSrc.getBalance() >= amount) {
            accountSrc.setBalance(accountSrc.getBalance() - amount);
            accountDest.setBalance(accountDest.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
