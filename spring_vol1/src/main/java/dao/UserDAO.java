package dao;

import domain.User;

import javax.sql.DataSource;
import java.sql.*;

public class UserDAO {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        System.out.println(dataSource.toString());
    }

    public void add(User user) throws ClassNotFoundException, SQLException {

        //Connection c = connectionMaker.makeConnection();
        Connection c = this.dataSource.getConnection();

        PreparedStatement ps = c.prepareStatement("insert into users(id, name, password) VALUES (?,?,?)");
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();

        ps.close();
        c.close();
    }

    public User get(String id) throws ClassNotFoundException, SQLException {

        //Connection c = connectionMaker.makeConnection();
        Connection c = this.dataSource.getConnection();

        PreparedStatement ps = c.prepareStatement("SELECT * FROM users WHERE id = ?");
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();
        rs.next();
        User user = new User();
        user.setId(rs.getString("id"));
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));

        rs.close();
        ps.close();
        c.close();

        return user;
    }

    /* 메소드 추출
    private Connection getConnection() throws ClassNotFoundException, SQLException{

        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/springbook", "spring", "springbook1234");
        return c;
    }
    */
}
