package employeeBean;



import javax.sql.DataSource;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.jdbc.datasource.DataSourceTransactionManager;
	import org.springframework.jdbc.datasource.DriverManagerDataSource;
	import org.springframework.jdbc.support.JdbcTransactionManager;
	import org.springframework.transaction.TransactionManager;
	import org.springframework.transaction.annotation.EnableTransactionManagement;



	@Configuration
	@ComponentScan(basePackages = "app")
	@EnableTransactionManagement
	public class Beanconfig {
		@Bean
		public JdbcTemplate jdbcTemplate() {
			return new JdbcTemplate(dataSource());
		}
		
		@Bean
		public DataSource dataSource() {
			return new DriverManagerDataSource("jdbc:mysql://localhost:3306/gasagency", 
					"root", "Admin@123" );
		}
		@Bean
		public Employe employe() {
			return new Employe();
		}
		@Bean
		public EmployeeRepository employeeRepository() {
			return new EmployeeRepository();
		}
		@Bean
		public TransactionManager transactionManager(DataSource dataSource) {
			return new DataSourceTransactionManager(dataSource);
		}
	}


