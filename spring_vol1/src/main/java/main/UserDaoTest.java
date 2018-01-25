package main;

import dao.DaoFactory;
import dao.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{


        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDAO dao = context.getBean("userDAO", UserDAO.class);

        DaoFactory factory = new DaoFactory();
        UserDAO dao1 = factory.userDAO();
        UserDAO dao2 = factory.userDAO();

        UserDAO dao3 = context.getBean("userDAO", UserDAO.class);
        UserDAO dao4 = context.getBean("userDAO", UserDAO.class);

        System.out.println(dao3);
        System.out.println(dao4);

        System.out.println(dao1);
        System.out.println(dao2);

    }
}
