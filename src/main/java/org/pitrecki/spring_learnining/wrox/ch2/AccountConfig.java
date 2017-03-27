package org.pitrecki.spring_learnining.wrox.ch2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-27.
 */
@Configuration
class AccountConfig
{
    @Bean
    AccountDao accountDao() {
        return new AccountDaoInMemoryImpl();
    }

    @Bean
    AccountService accountService() {
        return new AccountServiceImpl(accountDao());
    }
}
