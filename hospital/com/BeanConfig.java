package hospital.com;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import hospital.com.Appointment;
import hospital.com.Doctor;
import hospital.com.Patient;
import hospitalRepo.AppointmentRepo;
import hospitalRepo.DocRepository;
import hospitalRepo.PatientRepo;




	@Configuration
	@ComponentScan(basePackages = "hospitalService")
	@EnableTransactionManagement
	public class BeanConfig {
		@Bean
		public JdbcTemplate jdbcTemplate() {
			return new JdbcTemplate(dataSource());
		}
		
		@Bean
		public DataSource dataSource() {
			return new DriverManagerDataSource("jdbc:mysql://localhost:3306/hospital", 
					"root", "Admin@123" );
		}
		@Bean
		public Patient patient() {
			return new Patient();
		}
		@Bean
		public PatientRepo patientRepo() {
			return new PatientRepo();
		}
		
		@Bean
		public Appointment appointment() {
			return new Appointment();
		}
		@Bean
		public AppointmentRepo appointmentRepo() {
			return new AppointmentRepo();
		}
		
		@Bean
		public Doctor doctor() {
			return new Doctor();
		}
		@Bean
		public DocRepository docRepository() {
			return new DocRepository();
		}
		
		
		
		@Bean
		public TransactionManager transactionManager(DataSource dataSource) {
			return new DataSourceTransactionManager(dataSource);
		}
}
