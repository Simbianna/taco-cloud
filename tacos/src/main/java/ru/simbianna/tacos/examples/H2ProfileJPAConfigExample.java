package ru.simbianna.tacos.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/*
 * Just an example of using Profiles
*/

import javax.sql.DataSource;

//@Profile("pest") //possible too
@Configuration
public class H2ProfileJPAConfigExample {

    @Bean
    @Profile("pest")
    DataSource getTestDbSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:db;DB_CLOSE_DELAY=-1");
        dataSource.setUsername("sa");
        dataSource.setPassword("sa");

        return dataSource;
    }
}
