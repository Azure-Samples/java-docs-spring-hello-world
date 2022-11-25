package com.example.demo; 
import java.sql.*; 
import java.util.*; 
import java.util.logging.Logger; 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class DemoApplication {

    private static final Logger log;

    static {
        System.setProperty("java.util.logging.SimpleFormatter.format", "[%4$-7s] %5$s %n");
        log =Logger.getLogger(DemoApplication.class.getName());
    }

    @RequestMapping("/")
    public static void main(String[] args) throws Exception {
        log.info("Loading application properties");
        Properties properties = new Properties();
        properties.load(DemoApplication.class.getClassLoader().getResourceAsStream("application.properties"));

        log.info("Connecting to the database");
        Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties);
        log.info("Database connection test: " + connection.getCatalog());

        

		
		Salaries salaries= new Salaries();
		salaries = readData(connection);
		

        log.info("Closing database connection");
        connection.close();
    }
    
    private static Salaries readData(Connection connection) throws SQLException {
        log.info("Read data");
        PreparedStatement readStatement = connection.prepareStatement("SELECT * FROM dbo.salaries;");
        ResultSet resultSet = readStatement.executeQuery();
        if (!resultSet.next()) {
            log.info("There is no data in the database!");
            return null;
        }
        Salaries salaries = new Salaries();
        salaries.setWork_year(resultSet.getInt("work_year"));
        salaries.setExperience_level(resultSet.getString("experience_level"));
        salaries.setEmployment_type(resultSet.getString("employment_type"));
        salaries.setJob_title(resultSet.getString("job_title"));
        salaries.setSalary(resultSet.getInt("salary"));
        salaries.setSalary_currency(resultSet.getString("salary_currency"));
        salaries.setSalary_in_usd(resultSet.getInt("salary_in_usd"));
        salaries.setEmployee_residence(resultSet.getString("employee_residence"));
        salaries.setRemote_ratio(resultSet.getInt("remote_ratio"));
        salaries.setCompany_location(resultSet.getString("company_location"));
        salaries.setCompany_size(resultSet.getString("company_size"));
        
        log.info("Data read from the database: " + salaries.toString());
        return salaries;
    }
}
			

class Salaries {
    
    private int work_year;
    private String experience_level;
    private String employment_type;
    private String  job_title;
    private int salary;
    private String salary_currency;
    private int salary_in_usd;
    private String employee_residence;
    private int remote_ratio;
    private String company_location;
    private String company_size;
    
    public Salaries() {
    }

	public Salaries(int work_year, String experience_level, String employment_type, String job_title, int salary,
			String salary_currency, int salary_in_usd, String employee_residence, int remote_ratio,
			String company_location, String company_size) {
		super();
		this.work_year = work_year;
		this.experience_level = experience_level;
		this.employment_type = employment_type;
		this.job_title = job_title;
		this.salary = salary;
		this.salary_currency = salary_currency;
		this.salary_in_usd = salary_in_usd;
		this.employee_residence = employee_residence;
		this.remote_ratio = remote_ratio;
		this.company_location = company_location;
		this.company_size = company_size;
	}

	public int getWork_year() {
		return work_year;
	}

	public void setWork_year(int work_year) {
		this.work_year = work_year;
	}

	public String getExperience_level() {
		return experience_level;
	}

	public void setExperience_level(String experience_level) {
		this.experience_level = experience_level;
	}

	public String getEmployment_type() {
		return employment_type;
	}

	public void setEmployment_type(String employment_type) {
		this.employment_type = employment_type;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getSalary_currency() {
		return salary_currency;
	}

	public void setSalary_currency(String salary_currency) {
		this.salary_currency = salary_currency;
	}

	public int getSalary_in_usd() {
		return salary_in_usd;
	}

	public void setSalary_in_usd(int salary_in_usd) {
		this.salary_in_usd = salary_in_usd;
	}

	public String getEmployee_residence() {
		return employee_residence;
	}

	public void setEmployee_residence(String employee_residence) {
		this.employee_residence = employee_residence;
	}

	public int getRemote_ratio() {
		return remote_ratio;
	}

	public void setRemote_ratio(int remote_ratio) {
		this.remote_ratio = remote_ratio;
	}

	public String getCompany_location() {
		return company_location;
	}

	public void setCompany_location(String company_location) {
		this.company_location = company_location;
	}

	public String getCompany_size() {
		return company_size;
	}

	public void setCompany_size(String company_size) {
		this.company_size = company_size;
	}

	@Override
	public String toString() {
		return "Salaries [work_year=" + work_year + ", experience_level=" + experience_level + ", employment_type="
				+ employment_type + ", job_title=" + job_title + ", salary=" + salary + ", salary_currency="
				+ salary_currency + ", salary_in_usd=" + salary_in_usd + ", employee_residence=" + employee_residence
				+ ", remote_ratio=" + remote_ratio + ", company_location=" + company_location + ", company_size="
				+ company_size + "]";
	}
    
    
    
	
}