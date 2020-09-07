package portfolio.demo;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SqlTestConfig {

    @Bean
    DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setMaximumPoolSize(2);
        config.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        config.setJdbcUrl("jdbc:sqlserver://${MYSQL_HOST:localhost}:3306/db_Portfolio");
        config.setUsername("alex");
        config.setPassword("59476497");
        return new HikariDataSource(config);
    }
}
