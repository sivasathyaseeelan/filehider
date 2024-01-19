package service;

import java.sql.SQLException;

import dao.UserDAO;
import model.User;

public class UserService {
    public static Integer saveUser(User user) {
        try{
            if(UserDAO.isExist(user.getEmail())){
            return 0;
            }
            else{
                UserDAO.saveUser(user);
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
