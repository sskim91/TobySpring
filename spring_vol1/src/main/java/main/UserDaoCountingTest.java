package main;

import dao.CountingConnectionMaker;
import dao.CountingDaoFactory;
import dao.UserDAO;
import domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class UserDaoCountingTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CountingDaoFactory.class);

        UserDAO userDAO = context.getBean("userDAO", UserDAO.class);

        //DAO 사용코드
        User user = new User("sskim91", "sskim91", "sskim91");
        userDAO.add(user);
        userDAO.get("sskim91");

        CountingConnectionMaker ccm = context.getBean("connectionMaker", CountingConnectionMaker.class);
        //DL(의존관계 검색)을 사용하면 이름을 이용해 어떤 빈이든 가져올 수 있다.
        System.out.println("connection Counter: "+ ccm.getCounter());
    }
}
