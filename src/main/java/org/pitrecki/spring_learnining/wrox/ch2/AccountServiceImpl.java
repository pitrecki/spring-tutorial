package org.pitrecki.spring_learnining.wrox.ch2;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-27.
 */
class AccountServiceImpl implements AccountService
{
    private AccountDao accountDao;

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transferMoney(long sourceAccountId, long tagetAccountId, double amount) {
        Account source = accountDao.find(sourceAccountId);
        Account target = accountDao.find(tagetAccountId);

        source.setBalance(source.getBalance() - amount);
        target.setBalance(target.getBalance() + amount);

        accountDao.update(source);
        accountDao.update(target);
    }

    @Override
    public void depostiMoney(long accountId, double amount) throws IllegalArgumentException {
        if (amount < 0)
            throw new IllegalArgumentException("Deposit amount can not be negative");

        Account account = accountDao.find(accountId);
        account.setBalance(account.getBalance() + amount);

        accountDao.update(account);
    }

    @Override
    public Account getAccount(long accountId) {
        return accountDao.find(accountId);
    }
}
