package my.app.dao.config;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.sql.DataSource;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.dialect.Dialect;

@ApplicationScoped
public class DomaConfig implements Config {

	@Inject
	private DataSource dataSource;

	@Inject
	private Dialect dialect;

	@Override
	public DataSource getDataSource() {
		return this.dataSource;
	}

	@Override
	public Dialect getDialect() {
		return this.dialect;
	}

}
