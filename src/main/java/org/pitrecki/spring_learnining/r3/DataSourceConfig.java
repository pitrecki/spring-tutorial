package org.pitrecki.spring_learnining.r3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-16.
 */
@Configuration
public class DataSourceConfig
{
    @Bean(destroyMethod = "shutdown")
    @Profile("dev")
    public DataSource embededDataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:schema.sql")
                .addScript("classpath:test-data.sql")
                .build();
    }

    @Bean
    @Profile("prod")
    public DataSource jndiDataSource() {
        JndiObjectFactoryBean jdniObjectFactoryBean = new JndiObjectFactoryBean();
        jdniObjectFactoryBean.setJndiName("jdbc/myDS");
        jdniObjectFactoryBean.setResourceRef(true);
        jdniObjectFactoryBean.setProxyInterface(DataSource.class);
        return ((DataSource) jdniObjectFactoryBean.getObject());
    }
}
