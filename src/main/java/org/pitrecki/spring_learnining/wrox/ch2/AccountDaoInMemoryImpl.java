package org.pitrecki.spring_learnining.wrox.ch2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-27.
 */
class AccountDaoInMemoryImpl implements AccountDao
{
    private Map<Long, Account> accountMap = new HashMap<>(2);

     {
        Account firstAccount = new Account();
        firstAccount.setId(1L);
        firstAccount.setOwnerName("John Blue");
        firstAccount.setBalance(10d);

        Account secondAccount = new Account();
        secondAccount.setId(2L);
        secondAccount.setOwnerName("Stephen Neu");
        secondAccount.setBalance(15d);

        accountMap.put(firstAccount.getId(), firstAccount);
        accountMap.put(secondAccount.getId(), secondAccount);
    }

    @Override
    public void insert(Account account) {
        accountMap.put(account.getId(), account);
    }

    @Override
    public void update(Account account) {
        if (accountMap.containsKey(account.getId()))
            accountMap.replace(account.getId(), account);
        else
            throw new IllegalArgumentException("Specified account not exist in DB");
    }

    @Override
    public void update(List<Account> accounts) {
        accounts.stream()
                .collect(Collectors.toMap(Account::getId, Account::getClass));
    }

    @Override
    public void delete(Long accountId) {
        accountMap.remove(accountId);
    }

    @Override
    public Account find(Long accountId) {
        return accountMap.get(accountId);
    }

    @Override
    public List<Account> find(String ownerName) {
        return accountMap.entrySet().stream()
                .filter(e -> ownerName.equals(e.getValue().getOwnerName()))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    @Override
    public List<Account> find(List<Long> accountsId) {
         List<Account> foundedAccounts = new ArrayList<>();
         for (Long aLong : accountsId) {
             foundedAccounts.add(accountMap.get(aLong));
        }
        return foundedAccounts;
    }

    @Override
    public List<Account> find(boolean locked) {
        return null;
    }
}
