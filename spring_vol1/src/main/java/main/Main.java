//package main;
//
//import dao.UserDAO;
//import domain.User;
//
//import java.sql.SQLException;
//
//public class Main {
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//
//        UserDAO dao = new UserDAO();
//
//        User user = new User();
//        user.setId("sskim");
//        user.setName("섭섭");
//        user.setPassword("sskim");
//
//        dao.add(user);
//
//        System.out.println(user.getId() + " 등록 성공");
//
//        User user2 = dao.get(user.getId());
//        System.out.println(user2.getName());
//
//        System.out.println(user2.getPassword());
//
//        System.out.println(user2.getId() + " 조회 성공");
//    }
//}
