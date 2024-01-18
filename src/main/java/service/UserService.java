package service;

import java.sql.SQLException;

import doa.UserDOA;
import model.User;

public class UserService {
    public static Integer saveUser(User user) {
        try{
            if(UserDOA.isExist(user.getEmail())){
            return 0;
            }
            else{
                UserDOA.saveUser(user);
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
