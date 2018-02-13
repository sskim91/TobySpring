//package dao;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.SimpleDriverDataSource;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class DaoFactory {
//
//    @Bean
//    public DataSource dataSource() {
//
//        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
//        dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
//        dataSource.setUrl("jdbc:mysql://localhost/springbook");
//        dataSource.setUsername("spring");
//        dataSource.setPassword("springbook1234");
//
//        return dataSource;
//    }
//
//    @Bean
//    public UserDAO userDAO() {
//        UserDAO userDAO = new UserDAO();
//        userDAO.setDataSource(dataSource());
//        return userDAO;
//    }
//
//    @Bean
//    public ConnectionMaker connectionMaker() {
//        return new DConnectionMaker();
//    }
//}
