package org.deloitte.telecom.dao;

import org.deloitte.telecom.entities.MobileUser;

public interface IUserDao {
    boolean credentialsCorrect(String mobileno, String password);

    MobileUser findUserByMobileNo(String mobileno);

}
