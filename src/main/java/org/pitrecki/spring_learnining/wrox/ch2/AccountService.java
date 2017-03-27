package org.pitrecki.spring_learnining.wrox.ch2;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-27.
 */
interface AccountService
{
    void transferMoney(long sourceAccountId, long tagetAccountId, double amount);
    void depostiMoney(long accountId, double amount) throws IllegalArgumentException;
    Account getAccount(long accountId);
}
