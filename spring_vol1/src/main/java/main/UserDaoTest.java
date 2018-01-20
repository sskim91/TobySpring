package main;

import dao.ConnectionMaker;
import dao.DConnectionMaker;
import dao.UserDAO;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{

        ConnectionMaker connectionMaker = new DConnectionMaker();

        UserDAO dao = new UserDAO(connectionMaker);
    }
}
