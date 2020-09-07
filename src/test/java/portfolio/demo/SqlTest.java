package portfolio.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SqlTestConfig.class)
@Slf4j
/*@Sql(
        scripts = "/clearTables.sql",
        config = @SqlConfig(separator = "GO")
)*/
public class SqlTest {

    @Autowired
    DataSource dataSource;

    @Test
    public void test1() throws SQLException {
        log.info("catalog:" + dataSource.getConnection().getCatalog());
    }

    @Test
    public void test2() throws SQLException {
        log.info("catalog:" + dataSource.getConnection().getCatalog());
    }

    @Test
    public void test3() throws SQLException {
        log.info("catalog:" + dataSource.getConnection().getCatalog());
    }

    @Test
    public void test4() throws SQLException {
        log.info("catalog:" + dataSource.getConnection().getCatalog());
    }
}
