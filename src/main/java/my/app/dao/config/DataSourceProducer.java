package my.app.dao.config;

import javax.annotation.Resource;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.sql.DataSource;

import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.PostgresDialect;

@Dependent
public class DataSourceProducer {

	@Resource(lookup = "jdbc/MyAppDS")
	private DataSource dataSource;

	private Dialect dialect = new PostgresDialect();

	@Produces
	public DataSource getDataSource() {
		return dataSource;
	}

	@Produces
	public Dialect getDialect() {
		return dialect;
	}

}
