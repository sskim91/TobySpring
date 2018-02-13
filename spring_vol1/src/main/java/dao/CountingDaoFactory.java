package dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CountingDaoFactory {

    @Bean
    public UserDAO userDAO() {
        UserDAO userDAO = new UserDAO();
        userDAO.setConnectionMaker(connectionMaker());
        return userDAO;
        //모든 DAO는 여전히 ConnectionMaker()에서 만들어지는 오브젝트를 사용한다.
    }

    @Bean
    public ConnectionMaker connectionMaker() {
        return new CountingConnectionMaker(realConnectionMaker());
    }

    @Bean
    public ConnectionMaker realConnectionMaker() {
        return new DConnectionMaker();
    }
}
