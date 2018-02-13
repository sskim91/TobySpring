package main;

import dao.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        //JAVA 코드 설정 방식
//        ApplicationContext javacontext = new AnnotationConfigApplicationContext(DaoFactory.class);
//        UserDAO userDAO = javacontext.getBean("userDAO", UserDAO.class);
//        System.out.println("JAVA 설정 방식");
//        System.out.println(userDAO.get("sskim").getId());


        //XML 설정 방식
        ApplicationContext xmlcontext = new GenericXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO = xmlcontext.getBean("userDAO", UserDAO.class);
        System.out.println("XML 설정 방식");
        System.out.println(userDAO.get("sskim").getId());
    }
}
