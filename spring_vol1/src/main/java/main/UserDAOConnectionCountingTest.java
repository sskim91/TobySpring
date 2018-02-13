package main;

import dao.CountingConnectionMaker;
import dao.CountingDaoFactory;
import dao.UserDAO;
import domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class UserDAOConnectionCountingTest{

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CountingDaoFactory.class);
        UserDAO userDAO = context.getBean("userDAO", UserDAO.class);

        //DAO 사용 코드
        User user = new User("sskim91", "sskim91", "sskim91");
        userDAO.add(user);
        userDAO.get("sskim91");

        CountingConnectionMaker ccm = context.getBean("connectionMaker", CountingConnectionMaker.class);
        System.out.println("Connection counter " + ccm.getCount());

    }
}
