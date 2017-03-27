package org.pitrecki.spring_learnining.wrox.ch2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-27.
 */
class App
{
    final static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AccountConfig.class);
        AccountService accountService = context.getBean(AccountService.class);
        
        logger.info("Balance before transfer");
        logger.info("First balance: " + accountService.getAccount(1).getBalance());
        logger.info("Second balance: " + accountService.getAccount(2).getBalance());

        accountService.transferMoney(1, 2, 5d);

        logger.info("\n\n");

        logger.info("Balance after transfer");
        logger.info("First balance: " + accountService.getAccount(1).getBalance());
        logger.info("Second balance: " + accountService.getAccount(2).getBalance());
    }
}
