package org.pitrecki.spring_learnining.wrox.ch2;

import java.util.List;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-27.
 */
interface AccountDao
{
    void insert(Account account);
    void update(Account account);
    void update(List<Account> accounts);
    void delete(Long accountId);
    Account find(Long accountId);
    List<Account> find(String ownerName);
    List<Account> find(List<Long> accountsId);
    List<Account> find(boolean locked);

}
